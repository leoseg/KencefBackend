package com.example.kencefdataviewer.controller;


import com.example.kencefdataviewer.entities.Child;
import com.example.kencefdataviewer.repositories.ChildRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;




@RestController
@RequestMapping("/addChild")
public class ChildController {

    Logger logger = LoggerFactory.getLogger(ChildController.class);
    @Resource
    private ChildRepository childRepository;

    @PostMapping("/")
    public Child addNewChild(@RequestBody Child child){
        return childRepository.save(child);
    }


}
