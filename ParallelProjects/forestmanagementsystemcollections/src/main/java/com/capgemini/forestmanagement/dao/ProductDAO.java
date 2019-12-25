package com.capgemini.forestmanagement.dao;


import com.capgemini.forestmanagement.bean.ProductDetails;

public interface ProductDAO {
	public void addDetails(ProductDetails l);

	public void removeDetail(Integer landId);

	public void displayDetails();
	
	public void modifyDetails(ProductDetails p);
	
	public ProductDetails getDetails(Integer id);
	
}
