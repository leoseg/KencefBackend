package com.example.kencefdataviewer.controller;


import com.example.kencefdataviewer.entities.Child;
import com.example.kencefdataviewer.repositories.ChildRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.net.URI;
import java.net.URISyntaxException;


@Controller
@RequestMapping("/addChild")
public class ChildController {

    @Resource
    private ChildRepository childRepository;

    @PostMapping("/")
    public ResponseEntity addNewChild(Child child) throws URISyntaxException {
        Child saved_child = childRepository.save(child);
        return ResponseEntity.created(new URI("/childAdded")).body(saved_child);
    }


}
