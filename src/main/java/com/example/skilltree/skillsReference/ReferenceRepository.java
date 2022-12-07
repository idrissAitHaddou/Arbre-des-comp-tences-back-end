package com.example.skilltree.skillsReference;

import com.example.skilltree.competence.ValidateCompetence;
import com.example.skilltree.config.Config;
import com.example.skilltree.users.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReferenceRepository {
    public List<ValidateCompetence> allSkillsRepository(int idReference) {
        EntityManager em = Config.getConfig().getEntityManager();
        try{
            List<ValidateCompetence> skillsValidate = null;
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT V.id,V.name,V.first_level_status,V.second_level_status,V.thirth_level_status,V.id_user,V.competence.name FROM ValidateCompetence V where V.competence.referenceSkill.id = :idReference ORDER BY V.id_user ASC");
            query.setParameter("idReference", idReference);
            skillsValidate = query.getResultList();
            em.getTransaction().commit();
            return skillsValidate;
        }catch (Exception e) {
            return null;
        }finally {
            em.close();
        }
    }

    public static boolean changeStausSkillRepository(int idSkill, String status, String level) {
        EntityManager em = Config.getConfig().getEntityManager();
        try {
            em.getTransaction().begin();
            Query query = null;
            if(level.equals("n1")) {
                query = em.createQuery("UPDATE ValidateCompetence V SET V.first_level_status = :status WHERE V.id = :id");
            }else if(level.equals("n2")) {
                query = em.createQuery("UPDATE ValidateCompetence V SET V.second_level_status = :status WHERE V.id = :id");
            }else if(level.equals("n3")) {
                query = em.createQuery("UPDATE ValidateCompetence V SET V.thirth_level_status = :status WHERE V.id = :id");
            }
            query.setParameter("id",idSkill);
            query.setParameter("status",status);
            query.executeUpdate();
            em.getTransaction().commit();
            System.out.println("success");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            em.getTransaction().rollback();
            return false;
        } finally {
            em.close();
        }
    }
}
