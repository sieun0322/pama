package com.example.pama;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@SpringBootApplication
public class PamaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PamaApplication.class, args);
		/*
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("local");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try{
			tx.begin();
			logic(em);
			tx.commit();
		}catch (Exception e) {
			tx.rollback();
		} finally {
			em.close();
		}
		emf.close();*/

	}
	private static void logic(EntityManager em){

	}

}
