package com.cap.forestmanagement.services;


import com.cap.forestmanagement.bean.ProductDetails;
import com.cap.forestmanagement.dao.ProductDAO;
import com.cap.forestmanagement.factory.Factory;

public class ProductServicesImpl implements ProductServices {

	ProductDAO dao=Factory.objectProductDAO();

	@Override
	public void addDetails(Integer productId, ProductDetails l) {
		dao.addDetails(productId, l);

	}

	@Override
	public void removeContract(Integer productId) {
		dao.removeDetail(productId);

	}

	@Override
	public void displayDetails() {
		dao.displayDetails();

	}

}
