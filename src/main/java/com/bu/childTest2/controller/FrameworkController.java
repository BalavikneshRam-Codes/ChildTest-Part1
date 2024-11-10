package com.bu.childTest2.controller;

import com.bu.childTest2.model.Framework;
import com.bu.childTest2.service.FrameworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrameworkController {
    @Autowired
    private FrameworkService frameworkService;

    @PostMapping("/addFramework")
    public Framework addFramework(@RequestBody Framework framework){
        return frameworkService.addFramework(framework);
    }
}
