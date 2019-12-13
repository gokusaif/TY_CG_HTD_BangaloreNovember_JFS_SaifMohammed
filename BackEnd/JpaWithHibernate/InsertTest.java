package com.cap.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cap.jpawithhibernate.dto.Movie;

public class InsertTest {
	public static void main(String[] args) {
		Movie movie=new Movie();
		movie.setId(1002);
		movie.setName("Avengers 2");
		movie.setRating("Excellent");

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(movie);
		System.out.println("record inserted");
		transaction.commit();
		entityManager.close();


	}

}
