package com.cap.forestmanagement.services;


import com.cap.forestmanagement.bean.ProductDetails;
import com.cap.forestmanagement.dao.ProductDAO;
import com.cap.forestmanagement.factory.Factory;

public class ProductServicesImpl implements ProductServices {

	ProductDAO dao=Factory.objectProductDAO();

	

	@Override
	public void removeContract(Integer productId) {
		dao.removeDetail(productId);

	}

	@Override
	public void displayDetails() {
		dao.displayDetails();

	}

	@Override
	public void addDetails(ProductDetails l) {
		dao.addDetails(l);
		
	}

	@Override
	public void modifyDetails(ProductDetails p) {
		dao.modifyDetails(p);
		
	}

	@Override
	public ProductDetails getDetails(Integer id) {
		
		return dao.getDetails(id);
	}

}
