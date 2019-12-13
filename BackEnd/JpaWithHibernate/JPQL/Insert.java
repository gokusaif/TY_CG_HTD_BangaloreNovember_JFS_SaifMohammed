package com.cap.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Insert {
	public static void main(String[] args) {

		EntityManagerFactory emf=	Persistence.createEntityManagerFactory("Test");
		EntityManager em=emf.createEntityManager();
		EntityTransaction transaction=em.getTransaction();
		String query="insert into Movie values(185,'hello','hi')";
		//		String query="insert into Movie values(?,?,?)";
		transaction.begin();
		Query q=em.createNativeQuery(query);
		//		q.setParameter(1, 130);
		//		q.setParameter(2, "hello");
		//		q.setParameter(3, "HI");
		if(q.executeUpdate()>0) {
			System.out.println("inserted");
			transaction.commit();
		} else {
			System.out.println("not inserted");
		}
		em.close();
	}

}
