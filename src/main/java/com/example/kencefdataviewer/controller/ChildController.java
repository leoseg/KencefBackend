package com.example.kencefdataviewer.controller;


import com.example.kencefdataviewer.entities.Child;
import com.example.kencefdataviewer.repositories.ChildRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/child")
public class ChildController {

    Logger logger = LoggerFactory.getLogger(ChildController.class);
    @Resource
    private ChildRepository childRepository;

    @PostMapping("/add")
    public Child addNewChild(@RequestBody Child child){

        return childRepository.save(child);
    }

    @GetMapping("/get")
    public List<Child> getChilds(){
        return childRepository.findAll();
    }


}
