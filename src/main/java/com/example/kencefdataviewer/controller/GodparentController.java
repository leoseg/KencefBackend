package com.example.kencefdataviewer.controller;


import com.example.kencefdataviewer.entities.Godparent;
import com.example.kencefdataviewer.repositories.GodparentRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/parent")
public class GodparentController {

    @Resource
    GodparentRepository godparentRepository;


    @PostMapping("/add")
    public Godparent addNewGodparent(@RequestBody Godparent godparent){
       return godparentRepository.save(godparent);
    }


}
