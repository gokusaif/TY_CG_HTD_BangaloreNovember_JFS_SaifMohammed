package com.cap.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Update {
	public static void main(String[] args) {
		EntityManagerFactory emf=	Persistence.createEntityManagerFactory("Test");
		EntityManager em=emf.createEntityManager();
		EntityTransaction transaction=em.getTransaction();
		String query="update Movie set name=:mname where id=:mid";
		transaction.begin();
		Query q=em.createQuery(query);
		q.setParameter("mname","welcome");
		q.setParameter("mid",125);
		int r=q.executeUpdate();
		transaction.commit();
		if(r>0) {
			System.out.println("updated");
		} else {
			System.out.println("not updated");
		}

	}

}
