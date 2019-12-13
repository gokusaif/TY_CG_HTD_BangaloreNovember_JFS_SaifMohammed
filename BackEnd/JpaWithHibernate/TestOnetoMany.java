package com.cap.jpawithhibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cap.jpawithhibernate.manytoone.EmployeeExp;
import com.cap.jpawithhibernate.onetoone.EmployeeInfo;

public class TestOnetoMany {
	public static void main(String[] args) {
//		EmployeeInfo info=new EmployeeInfo();
//		info.setEid(120);
//		info.setName("Sherlock");
//		info.setEmail("sherlock@gmail.com");
//		info.setPassword("adler");
//
//		EmployeeExp exp= new EmployeeExp();
//		exp.setEmpid(12);
//		exp.setCompany("wipro");
//		exp.setNoOfYears(3);
//		exp.setEmpe(info);
//
//		EmployeeExp exp1= new EmployeeExp();
//		exp1.setEmpid(14);
//		exp1.setCompany("infosys");
//		exp1.setNoOfYears(5);
//		exp1.setEmpe(info);

		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
//			transaction.begin();
			EmployeeInfo ei=entityManager.find(EmployeeInfo.class, 120);
			ei.getExp().getNoOfYears();
//			entityManager.persist(exp);
//			entityManager.persist(exp1);

			transaction.commit();
			System.out.println("record inserted");
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();

	}

}
