package com.capgemini.springrest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.capgemini.springrest.dto.EmployeeBean;
import com.capgemini.springrest.exceptions.EmployeeException;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	BCryptPasswordEncoder encoder= new BCryptPasswordEncoder();

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public EmployeeBean auth(String email, String password) {
		EntityManager manager=factory.createEntityManager();
		String jpql="from EmployeeBean where email=:email";
		TypedQuery<EmployeeBean> query = manager.createQuery(jpql,EmployeeBean.class);
		query.setParameter("email", email);
//		query.setParameter("pass", password);
		try {
			EmployeeBean bean = query.getSingleResult();
			if(encoder.matches(password, bean.getPassword())) {
				return bean;
				
			} else {
				throw new EmployeeException("Password invalid");
			}
		}
		catch (Exception e) {
			throw new EmployeeException("Email invalid");
		}
	}

	@Override
	public boolean register(EmployeeBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return true;
		}
		catch(Exception e) {
			throw new EmployeeException("Email already exists");
		}
	}


	@Override
	public List<EmployeeBean> getAllEmployees(String key) {
		EntityManager manager=factory.createEntityManager();
		String jpql="from EmployeeBean where name=:name or email=:email";
		TypedQuery<EmployeeBean> query = manager.createQuery(jpql,EmployeeBean.class);
		query.setParameter("name", key);
		query.setParameter("email", key);
		return query.getResultList();
	}

	@Override
	public boolean changePassword(int id, String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		EmployeeBean bean= manager.find(EmployeeBean.class, id);
		bean.setPassword(password);
		transaction.commit();
		return true;
	}

	@Override
	public boolean deleteEmployee(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		EmployeeBean bean = manager.find(EmployeeBean.class,id);
		if(bean!=null) {
		manager.remove(bean);
		transaction.commit();
		return true;
		} else {
			throw new EmployeeException("Employee not found");
		}
	}

}
