package com.example.kencefdataviewer.controller;


import com.example.kencefdataviewer.entities.Child;
import com.example.kencefdataviewer.repositories.ChildRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

/**
 * Controller for the rest-api of the child table
 */
@RestController
@RequestMapping("/child")
public class ChildController {

    Logger logger = LoggerFactory.getLogger(ChildController.class);
    @Resource
    private ChildRepository childRepository;

    /**
     * Adds new child to table
     * @param child to add
     * @return child added
     */
    @PostMapping("/add")
    public Child addNewChild(@RequestBody Child child){
        logger.debug("Child with name "+ child.getName()+" was added");
        return childRepository.save(child);
    }

    /**
     * Gets all childs from table
     * @return list of childs objects
     */
    @GetMapping("/get")
    public List<Child> getChilds(){
        return childRepository.findAll();
    }

    /**
     * Gets all childs from table without godparent
     * @return list of childs objects
     */
    @GetMapping("/getwithoutparent")
    public List<Child> getChildsWithoutParent(){
        return childRepository.findByGodparentIsNull();
    }


}
