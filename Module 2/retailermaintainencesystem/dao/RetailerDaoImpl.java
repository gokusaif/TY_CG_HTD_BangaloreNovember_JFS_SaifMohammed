package com.capgemini.retailermaintainencesystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.retailermaintainencesystem.dto.Order;
import com.capgemini.retailermaintainencesystem.dto.Product;
import com.capgemini.retailermaintainencesystem.dto.User;
import com.capgemini.retailermaintainencesystem.exceptions.RetailerException;

@Repository
public class RetailerDaoImpl implements RetailerDao {

	@PersistenceUnit
	EntityManagerFactory entityManagerFactory;

	User user;

	@Override
	public boolean createUser(User user) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(user);
			transaction.commit();
			return true;
		} catch (Exception e) {
			throw new RetailerException("User with same email already exists");
		}
	}

	@Override
	public User login(User credentials) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		String login = "from User where email=:email";
		TypedQuery<User> query = manager.createQuery(login, User.class);
		query.setParameter("email", credentials.getEmail());
		try {
			user = query.getSingleResult();
			if (user.getPassword().equals(credentials.getPassword())) {
				return user;
			} else {
				return null;
			}
		} catch (Exception e) {
			throw new RetailerException("User account not found email not registered");
		}
	}

	@Override
	public List<Product> viewProduct() {
		EntityManager manager = entityManagerFactory.createEntityManager();
		String showProducts = "from Product";
		TypedQuery<Product> query = manager.createQuery(showProducts, Product.class);
		List<Product> products = query.getResultList();
		if (products.size() != 0) {
			return products;
		} else {
			throw new RetailerException("Products does not exists");
		}
	}

	@Override
	public boolean updatePassword(User credentials) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		String login = "from User where email=:email";
		TypedQuery<User> query = manager.createQuery(login, User.class);
		query.setParameter("email", credentials.getEmail());
		EntityTransaction transaction = manager.getTransaction();
		try {
			User user = query.getSingleResult();
			if (user.getPassword().equals(credentials.getPassword())) {
				transaction.begin();
				user.setPassword(credentials.getPassword());
				transaction.commit();
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			throw new RetailerException("User account not found email not registered");
		}
	}

	@Override
	public Order viewOrder(int orderId) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		Order order = manager.find(Order.class, orderId);
		if (order != null) {
			return order;
		} else {
			throw new RetailerException("Order id does not exist order not found");
		}
	}

	public boolean placeOrder(String productName) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		String showProducts = "from Product where name=:name";
		TypedQuery<Product> query = manager.createQuery(showProducts, Product.class);
		query.setParameter("name", productName);
		try {
			Product product = query.getSingleResult();
			transaction.begin();
			Order order = new Order();
			order.setProductId(product);
			if(user==null) {
				return false;
			}
			order.setUserid(user);
			manager.persist(order);
			transaction.commit();
			return true;
		} catch (Exception e) {
			throw new RetailerException("Products does not exist");
		}
	}

	@Override
	public boolean insertProduct(Product product) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(product);
			transaction.commit();
			return true;
		} catch (Exception e) {
			throw new RetailerException("Product with same name already exists");
		}
	}

	public boolean logout() {
		try {
			if (user != null);
			user = null;
			return true;
		} catch (Exception e) {
			throw new RetailerException("first login");
		}
	}
}
