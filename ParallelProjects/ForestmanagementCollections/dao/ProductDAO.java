package com.cap.forestmanagement.dao;

import com.cap.forestmanagement.bean.LandDetails;
import com.cap.forestmanagement.bean.ProductDetails;

public interface ProductDAO {
	public void addDetails(Integer landId,ProductDetails l);

	public void removeDetail(Integer landId);

	public void displayDetails();
}
