package com.example.skilltree.skillsReference;

import com.example.skilltree.config.Config;
import com.example.skilltree.users.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReferenceRepository {
    public List<ReferenceSkill> allSkillsRepository() {
        EntityManager em = Config.getConfig().getEntityManager();
        try{
            List<ReferenceSkill> skills = null;
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT R FROM ReferenceSkill R");
            skills = query.getResultList();
            em.getTransaction().commit();
            return skills;
        }catch (Exception e) {
            return null;
        }finally {
            em.close();
        }
    }
}
