package com.cap.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cap.jpawithhibernate.dto.Movie;

public class ReAttach {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			Movie rs=entityManager.find(Movie.class, 100);
			System.out.println(entityManager.contains(rs));
			entityManager.detach(rs);
			System.out.println(entityManager.contains(rs));
			Movie mov=entityManager.merge(rs);
			System.out.println(entityManager.contains(mov));
			if(entityManager.contains(mov)) {
				mov.setName("sherlock");
				System.out.println("updated"); }
			else {
				System.out.println("record not found");
			}
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();
	}

}
