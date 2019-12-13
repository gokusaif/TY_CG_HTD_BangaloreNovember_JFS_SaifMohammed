package com.cap.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cap.jpawithhibernate.dto.Movie;

public class Test {
	public static void main(String[] args) {
		Movie movie=new Movie();
		movie.setId(102);
		movie.setName("Avengers");
		movie.setRating("Excellent");

		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");//db info
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(movie);
			transaction.commit();
			System.out.println("record inserted");
		} catch (Exception e) {

			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();


	}

}
