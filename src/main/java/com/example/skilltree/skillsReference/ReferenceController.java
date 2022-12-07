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
    public String allSkillsController(@RequestParam(value = "idReference") int idReference){
        return referenceService.allSkillsService(idReference);
    }

    @GetMapping("/validate")
    public String chnageSkillStatusController(@RequestParam(value = "idSkill") int idSkill, @RequestParam(value = "status") String status, @RequestParam(value = "level") String level){
        return referenceService.chnageSkillStatusService(idSkill, status, level);
    }
}
