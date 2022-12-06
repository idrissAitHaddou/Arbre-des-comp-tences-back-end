package com.example.skilltree.skillsReference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping("/api/skill")
@CrossOrigin(origins = "http://localhost:4200")
public class ReferenceController {
    @Autowired
    private ReferenceService referenceService;
    @GetMapping("/all")
    public String allSkillsController(){
        return referenceService.allSkillsService();
    }
}
