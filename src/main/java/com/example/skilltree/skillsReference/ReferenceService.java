package com.example.skilltree.skillsReference;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReferenceService {
    @Autowired
    private ReferenceRepository referenceRepository;

    public String allSkillsService() {
        List<ReferenceSkill> skills = referenceRepository.allSkillsRepository();
        System.out.println("hello world");
        System.out.println(skills.toString());
        return new Gson().toJson(skills);
    }
}
