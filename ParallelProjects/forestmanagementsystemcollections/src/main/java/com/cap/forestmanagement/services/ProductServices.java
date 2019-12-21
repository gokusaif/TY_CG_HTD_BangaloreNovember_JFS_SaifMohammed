package com.cap.forestmanagement.services;


import com.cap.forestmanagement.bean.ProductDetails;

public interface ProductServices {
	public void addDetails(ProductDetails l);

	public void removeContract(Integer productId);

	public void displayDetails();
	
	public void modifyDetails(ProductDetails p);
	
	public ProductDetails getDetails(Integer id);
}
