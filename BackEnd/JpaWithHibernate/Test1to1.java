package com.cap.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cap.jpawithhibernate.onetoone.EmployeeInfo;
import com.cap.jpawithhibernate.onetoone.EmployeeOtherInfo;

public class Test1to1 {
	public static void main(String[] args) {
//		EmployeeInfo emp=new EmployeeInfo();
//		emp.setEid(100);
//		emp.setName("John");
//		emp.setEmail("john@gmail.com");
//		emp.setPassword("john123");
//	
//		EmployeeOtherInfo o=new EmployeeOtherInfo();
//		o.setId(100);
//		o.setFathername("watson");
//		o.setPancard("123edf");
//		o.setEmp(emp);
		EntityManager entityManager=null;
//		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
//			transaction = entityManager.getTransaction();
//			transaction.begin();
			EmployeeInfo empa=entityManager.find(EmployeeInfo.class, 100);
			System.out.println(empa.getOther().getFathername());
//			entityManager.persist(o);
//			transaction.commit();
//			System.out.println("record inserted");
		}catch(Exception e) {
			e.printStackTrace();
//			transaction.rollback();
		}
		entityManager.close();

	}
}
