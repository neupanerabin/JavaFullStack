package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.entity.Product;

public class AppEntity {

    public static void main(String[] args) {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("jpaexample");
        EntityManager em = emFactory.createEntityManager();

        Product p1 = new Product("HP spectot", "HP", "345633");


        em.getTransaction().begin();
        em.persist(p1);
        em.getTransaction().commit();
        em.close();


    }
}
