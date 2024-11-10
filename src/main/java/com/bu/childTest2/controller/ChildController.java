package com.bu.childTest2.controller;

import com.bu.childTest2.model.Child;
import com.bu.childTest2.service.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChildController {
    @Autowired
    ChildService childService;

    @PostMapping("/addChild")
    public Child addchild(@RequestBody Child child){
        return childService.addChild(child);
    }
}
