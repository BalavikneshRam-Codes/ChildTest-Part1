package com.bu.childTest2.service;

import com.bu.childTest2.model.Child;
import com.bu.childTest2.model.Framework;
import com.bu.childTest2.model.Question;
import com.bu.childTest2.repository.ChildReporitory;
import com.bu.childTest2.repository.FrameworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChildService {
    @Autowired
    private ChildReporitory childReporitory;

    @Autowired
    private FrameworkRepository frameworkRepository;



    public Child addChild(Child child){
        Framework framework = frameworkRepository.findById(child.getFramework().getFrameworkId()).get();
        child.setFramework(framework);
        childReporitory.save(child);
        return child;
    }
}
