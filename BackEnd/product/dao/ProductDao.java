package com.capgemini.product.dao;

import java.util.List;

import com.capgemini.product.dto.Product;

public interface ProductDao {

	public boolean addProduct(Product product);
	
	public Product getProduct(int id);
	
	public List<Product> getAllProducts();
	
	public boolean deleteProduct(int id);
	
}
