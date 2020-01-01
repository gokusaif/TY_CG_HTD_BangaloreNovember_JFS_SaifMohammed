package com.capgemini.product.service;

import java.util.List;

import com.capgemini.product.dto.Product;

public interface ProductService {

	public boolean addProduct(Product product);
	
	public Product getProduct(int id);
	
	public List<Product> getAllProducts();
	
	public boolean deleteProduct(int id);
}
