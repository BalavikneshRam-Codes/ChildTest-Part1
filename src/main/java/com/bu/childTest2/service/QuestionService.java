package com.bu.childTest2.service;

import com.bu.childTest2.model.Question;
import com.bu.childTest2.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    public Question saveQuestion(Question question){
        return questionRepository.save(question);
    }
}
