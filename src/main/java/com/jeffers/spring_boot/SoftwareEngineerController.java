package com.jeffers.spring_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/software-engineer")
public class SoftwareEngineerController {
    @GetMapping
    public List<SoftwareEngineer> getSoftwareEngineer(){
        return List.of(
                new SoftwareEngineer("js, node, react", "Murira", 1),
                new SoftwareEngineer("Java, spring", "Jamilla", 2)
        );
    }
}
