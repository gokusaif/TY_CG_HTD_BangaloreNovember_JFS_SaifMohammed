package com.cap.forestmanagement.services;


import com.cap.forestmanagement.bean.ProductDetails;

public interface ProductServices {
	public void addDetails(Integer productId,ProductDetails l);

	public void removeContract(Integer productId);

	public void displayDetails();
}
