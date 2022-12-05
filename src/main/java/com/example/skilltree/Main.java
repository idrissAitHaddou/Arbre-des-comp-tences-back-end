package com.example.skilltree;

import com.example.skilltree.users.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("skills");
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        User user = new User();
        user.setClassroom("Brandin Eich");
        user.setEmail("idissaithadou@gmail.com");
        user.setFirstname("idriss");
        user.setLastname("ait haddou");
        user.setLevel("2 éme année");
        user.setPromotion("2022 - 2023");
        user.setPassword("123");
        entityManager.persist(user);
        entityManager.close();
        factory.close();
    }
}
