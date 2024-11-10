package com.bu.childTest2.service;

import com.bu.childTest2.dto.RatingDto;
import com.bu.childTest2.model.Child;
import com.bu.childTest2.model.Question;
import com.bu.childTest2.model.Rating;
import com.bu.childTest2.repository.ChildReporitory;
import com.bu.childTest2.repository.QuestionRepository;
import com.bu.childTest2.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RatingService {
    @Autowired
    private RatingRepository ratingRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private ChildReporitory childReporitory;

//    public Rating  addRating(Rating rating){
//        return ratingRepository.save(rating);
//    }
public void saveRatings(Integer childId, List<RatingDto> ratingDTOs) {
    Child child = childReporitory.findById(childId).orElseThrow(() -> new RuntimeException("Child not found"));

    List<Rating> ratings = ratingDTOs.stream().map(dto -> {
        Question question = questionRepository.findById(dto.getQuestionId())
                .orElseThrow(() -> new RuntimeException("Question not found"));

        Rating rating = new Rating();
        rating.setScore(dto.getScore());
        rating.setChild(child);
        rating.setQuestion(question);
        return rating;
    }).collect(Collectors.toList());

    ratingRepository.saveAll(ratings);
}



    public List<RatingDto> getRating(int childId) {
        List<Rating> ratings = ratingRepository.findByChild_childId(childId);
        return ratings.stream().map(rating -> new RatingDto(
            rating.getQuestion().getQuestionId(),
            rating.getScore()
        )).collect(Collectors.toList());
    }
}
