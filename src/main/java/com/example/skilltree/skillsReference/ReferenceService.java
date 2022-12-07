package com.example.skilltree.skillsReference;

import com.example.skilltree.competence.ValidateCompetence;
import com.example.skilltree.users.User;
import com.example.skilltree.users.UserRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class ReferenceService {
    @Autowired
    private ReferenceRepository referenceRepository;
    @Autowired
    private UserRepository userRepository;

    public String allSkillsService(int idReference) {
         List<ValidateCompetence> skillsValidate = referenceRepository.allSkillsRepository(idReference);
        return new Gson().toJson(skillsValidate);
    }

    public String chnageSkillStatusService(int idSkill, String status, String level) {
        referenceRepository.changeStausSkillRepository(idSkill, status, level);
        HashMap<String, String> response = new HashMap<>();
        response.put("status", "success");
        return new Gson().toJson(response);
    }
}
