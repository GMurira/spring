package com.jeffers.spring_boot.controllers;

import com.jeffers.spring_boot.model.SoftwareEngineer;
import com.jeffers.spring_boot.service.SoftwareEngineerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/software-engineer")
public class SoftwareEngineerController {
    private final SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }


    @GetMapping
    public List<SoftwareEngineer> getSoftwareEngineer() {
        return softwareEngineerService.getAllSoftwareEngineers();
    }

    /**
     * get software engineer by id
     */
    @GetMapping("{id}")
    public SoftwareEngineer getSoftwareEngineerById(@PathVariable Integer id){
        return softwareEngineerService.getSoftwareEngineerById(id);
    }
    /**
     * an end point to add new software engineers
     */
    @PostMapping
    public void addNewSoftwareEngineer(@RequestBody SoftwareEngineer softwareEngineer) {
        softwareEngineerService.insertSoftwareEngineer(softwareEngineer);
    }
}
