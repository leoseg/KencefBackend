package com.example.kencefdataviewer.controller;


import com.example.kencefdataviewer.entities.Godparent;
import com.example.kencefdataviewer.repositories.GodparentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


/**
 * Controller for the rest-api of the godparent relation
 */
@RestController
@RequestMapping("/godparent")
public class GodparentController {

    Logger logger = LoggerFactory.getLogger(GodparentController.class);

    @Resource
    GodparentRepository godparentRepository;


    /**
     * Adds new godparent to table
     * @param godparent to add
     * @return godparent added
     */
    @PostMapping("/add")
    public Godparent addNewGodparent(@RequestBody Godparent godparent){
        logger.debug("Child with name "+ godparent.getName()+" was added");
        return godparentRepository.save(godparent);
    }

    /**
     * Gets all godparents from table
     * @return list of godparent objects
     */
    @GetMapping("/get")
    public List<Godparent> getGodparents(){
        return godparentRepository.findAll();
    }


}
