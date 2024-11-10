package com.bu.childTest2.controller;

import com.bu.childTest2.dto.RatingDto;
import com.bu.childTest2.dto.RatingRequest;
import com.bu.childTest2.model.Rating;
import com.bu.childTest2.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RatingController {
    @Autowired
    private RatingService ratingService;

    @PostMapping("/submit")
    public ResponseEntity<String> submitRatings(@RequestBody RatingRequest request) {
        ratingService.saveRatings(request.getChildId(), request.getRatings());
        return ResponseEntity.ok("Ratings saved successfully!");
    }

    @GetMapping("/rating/{childId}")
    public List<RatingDto> getRating(@PathVariable int childId){
        return ratingService.getRating(childId);
    }
}
