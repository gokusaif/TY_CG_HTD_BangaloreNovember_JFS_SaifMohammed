package com.cap.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cap.jpawithhibernate.dto.Movie;

public class RetriveRef {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager=null;


		try {
			entityManager=entityManagerFactory.createEntityManager();
			Movie rs=entityManager.getReference(Movie.class,200);
//			Movie rs=entityManager.find(Movie.class, 100);
			System.out.println(rs.getClass());
//			System.out.println(rs.getId());
//			System.out.println(rs.getName());
//			System.out.println(rs.getRating());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
