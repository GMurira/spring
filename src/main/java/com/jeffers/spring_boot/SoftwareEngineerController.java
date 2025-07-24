package com.jeffers.spring_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
     * an end point to add new software engineers
     */
    public void addNewSoftwareEngineer(SoftwareEngineer softwareEngineer){

    }
}
