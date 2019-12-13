package com.cap.jpql;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Delete {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EntityManagerFactory emf=	Persistence.createEntityManagerFactory("Test");
		EntityManager em=emf.createEntityManager();
		EntityTransaction transaction=em.getTransaction();
		String query="delete from Movie where id=:mid";
		transaction.begin();
		Query q=em.createQuery(query);
		System.out.println("enter movie id to delete");
		q.setParameter("mid",sc.nextInt());
		int r=q.executeUpdate();
		transaction.commit();
		if(r>0) {
			System.out.println("deleted");
		} else {
			System.out.println("id not found");
		}
	}
}
