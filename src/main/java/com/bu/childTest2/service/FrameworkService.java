package com.bu.childTest2.service;

import com.bu.childTest2.model.Framework;
import com.bu.childTest2.model.Question;
import com.bu.childTest2.repository.FrameworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FrameworkService {

    @Autowired
    private FrameworkRepository frameworkRepository;

    public Framework addFramework(Framework framework){
        if (framework.getQuestionList() != null) {
            for (Question question : framework.getQuestionList()) {
                question.setFramework(framework);
            }
        }
        return frameworkRepository.save(framework);
    }
}
