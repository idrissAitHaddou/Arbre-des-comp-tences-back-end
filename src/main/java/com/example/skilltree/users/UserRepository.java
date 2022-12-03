package com.example.skilltree.users;

import com.google.gson.Gson;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class UserRepository {
    public String usertestRepo() {
        HashMap<String, String> response = new HashMap<>();
        response.put("message", "test rest api repository");
        return new Gson().toJson(response);
//        List<Apprenants> result = null;
//        Apprenants learner = null;
//        EntityManager em = Config.getConfig().getEntityManager();
//        em.getTransaction().begin();
//        Query query = em.createQuery("SELECT A FROM Apprenants A where A.email = :email and A.password = :password");
//        query.setParameter("password", passowrd);
//        query.setParameter("email", email);
//        result = query.getResultList();
//        em.getTransaction().commit();
//        em.close();
    }
}
