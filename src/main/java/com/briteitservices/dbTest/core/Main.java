package com.briteitservices.dbTest.core;

import com.briteitservices.dbTest.core.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ExamplePU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        TypedQuery<User> query = entityManager.createQuery("from User", User.class);
        List<User> users = query.getResultList();

        for (User user : users) {
            System.out.println(user.getName());
        }

        entityManagerFactory.close();
    }
}
