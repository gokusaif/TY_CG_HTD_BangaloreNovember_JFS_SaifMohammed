package com.cap.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cap.jpawithhibernate.dto.Movie;

public class Retrive {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Movie rs=entityManager.find(Movie.class,10);
		System.out.println("Id is"+rs.getId());
		System.out.println("name is "+rs.getName());
		System.out.println("rating is"+rs.getRating());
		entityManager.close();
		
	}
}
