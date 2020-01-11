package com.capgemini.retailermaintainencesystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.retailermaintainencesystem.dao.RetailerDao;
import com.capgemini.retailermaintainencesystem.dto.Order;
import com.capgemini.retailermaintainencesystem.dto.Product;
import com.capgemini.retailermaintainencesystem.dto.User;
import com.capgemini.retailermaintainencesystem.exceptions.RetailerException;

@Service
public class RetailerServicesImpl implements RetailerServices{

	@Autowired
	RetailerDao retailerDao;
	
	@Override
	public boolean createUser(User user) {
		return retailerDao.createUser(user);
	}

	@Override
	public User login(User credentials) {
		return retailerDao.login(credentials);
	}

	@Override
	public List<Product> viewProduct() {
		
		return retailerDao.viewProduct();
	}

	@Override
	public boolean updatePassword(User user) {
		
		return retailerDao.updatePassword(user);
	}

	@Override
	public Order viewOrder(int orderId) {
		
		return retailerDao.viewOrder(orderId);
	}

	@Override
	public boolean insertProduct(Product product) {

		return retailerDao.insertProduct(product); 
	}

	@Override
	public boolean logout() {

		return retailerDao.logout();
	}

	@Override
	public boolean placeOrder(String productName) {
		
		return retailerDao.placeOrder(productName);
	}

}
