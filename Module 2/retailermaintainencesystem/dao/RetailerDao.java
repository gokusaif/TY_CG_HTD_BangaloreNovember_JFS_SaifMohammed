package com.capgemini.retailermaintainencesystem.dao;

import java.util.List;

import com.capgemini.retailermaintainencesystem.dto.Order;
import com.capgemini.retailermaintainencesystem.dto.Product;
import com.capgemini.retailermaintainencesystem.dto.User;

public interface RetailerDao {
	
	public boolean createUser(User user);
	
	public User login(User credentials);
	
	public List<Product> viewProduct();
	
	public boolean updatePassword(User user);
	
	public Order viewOrder(int orderId);
	
	public boolean insertProduct(Product product);
	
	public boolean placeOrder(String productName);
	
	public boolean logout();

}
