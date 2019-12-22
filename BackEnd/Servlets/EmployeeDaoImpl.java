package com.cap.webapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cap.webapp.beans.EmployeeInfoBean;

public class EmployeeDaoImpl implements EmployeeDao{

	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emp");

	@Override
	public EmployeeInfoBean searchEmployee(int empId) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EmployeeInfoBean employeeInfoBean=entityManager.find(EmployeeInfoBean.class, empId);
		entityManager.close();
		return employeeInfoBean;
	}

	@Override
	public EmployeeInfoBean authenticate(int empId, String password) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql="from EmployeeInfoBean where empId=:empid and password=:pwd";
		Query query=entityManager.createQuery(jpql);
		query.setParameter("empid",empId);
		query.setParameter("pwd",password);
		EmployeeInfoBean employeeInfoBean= null; //return null if exception
		try {
			employeeInfoBean =(EmployeeInfoBean) query.getSingleResult();// downcast to employeeinfobean

		} catch (Exception e) {
			e.printStackTrace();
		}
		entityManager.close();
		return employeeInfoBean; //if not exception
	}

	@Override
	public boolean addEmployee(EmployeeInfoBean eBean) {
		boolean res = false;
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction  = entityManager.getTransaction();
		transaction.begin();
		try {
			entityManager.persist(eBean);
			transaction.commit();
			res=true;
		} catch (Exception e) {
			transaction.rollback();
		}
		entityManager.close();
		return res;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		boolean res=false;
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction  = entityManager.getTransaction();
		EmployeeInfoBean bean=entityManager.find(EmployeeInfoBean.class, empId);
		if(bean!=null) {
			transaction.begin();
			entityManager.remove(bean);
			transaction.commit();
			res=true;
		} 
		entityManager.close();
		return res;
	}

	@Override
	public boolean updateEmployee(EmployeeInfoBean inputBean) {
		boolean res=false;
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction  = entityManager.getTransaction();

		EmployeeInfoBean existingBean=entityManager.find(EmployeeInfoBean.class,inputBean.getEmpId());
		try {
			transaction.begin();
			if(existingBean!=null) {
				String newName = inputBean.getName().trim();

				if(newName != null && !newName.isEmpty()) {
					existingBean.setName(newName);
				}

				int newAge = inputBean.getAge();

				if(newAge>18) {
					existingBean.setAge(newAge);
				}

				String newDesignation = inputBean.getDesignation().trim();

				if(newDesignation != null && !newDesignation.isEmpty()) {
					existingBean.setDesignation(newDesignation);
				}

				double newSalary = inputBean.getSalary();

				if(newSalary>0) {
					existingBean.setSalary(newSalary);
				}

				String newPassword = inputBean.getPassword().trim();

				if(newPassword != null && !newPassword.isEmpty()) {
					existingBean.setPassword(newPassword);
				}
				transaction.commit();
				res=true;

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		entityManager.close();
		return res;
	}

	@Override
	public List<EmployeeInfoBean> getAllEmployees() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String query="from EmployeeInfoBean";
		Query q=entityManager.createQuery(query);
		List<EmployeeInfoBean> l1=q.getResultList();
		if(l1!=null) {
			entityManager.close();
			return l1;
		} else {
			entityManager.close();
			return null;
		}
	}

}
