package com.cap.jpawithhibernate;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cap.jpawithhibernate.manytomany.TrainingInfo;
import com.cap.jpawithhibernate.onetoone.EmployeeInfo;

public class TestManyToMany {
	public static void main(String[] args) {
		
		EmployeeInfo emp=new EmployeeInfo();
		emp.setEid(1);
		emp.setName("Tom");
		emp.setEmail("tom@gmail.com");
		emp.setPassword("123");
		
		EmployeeInfo emp1=new EmployeeInfo();
		emp1.setEid(2);
		emp1.setName("Sam");
		emp1.setEmail("sam@gmail.com");
		emp1.setPassword("123");
		
		ArrayList<EmployeeInfo> e1=new ArrayList<EmployeeInfo>();
		e1.add(emp);
		e1.add(emp1);
		
		TrainingInfo t=new TrainingInfo();
		t.setTid(2);
		t.setTname("java fullstack");
		t.setEList(e1);
		
		
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(t);
		
			transaction.commit();
			System.out.println("record inserted");
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();
	}
}
