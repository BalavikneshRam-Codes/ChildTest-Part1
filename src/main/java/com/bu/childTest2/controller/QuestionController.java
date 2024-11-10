package com.bu.childTest2.controller;

import com.bu.childTest2.model.Question;
import com.bu.childTest2.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {
    @Autowired
    private QuestionService questionService;


    @PostMapping("/addQuestion")
    public Question saveQuestion(@RequestBody Question question){
        return questionService.saveQuestion(question);
    }
}
