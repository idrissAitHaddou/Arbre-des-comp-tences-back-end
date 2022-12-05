package com.example.skilltree.users;

import com.example.skilltree.config.Config;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    public List<User> loginRepository(String email, String password) {
        EntityManager em = Config.getConfig().getEntityManager();
        try{
            List<User> users = null;
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT U FROM User U where U.email = :email and U.password = :password");
            query.setParameter("password", password);
            query.setParameter("email", email);
            users = query.getResultList();
            em.getTransaction().commit();
            return users;
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }finally {
            em.close();
        }
    }
}
