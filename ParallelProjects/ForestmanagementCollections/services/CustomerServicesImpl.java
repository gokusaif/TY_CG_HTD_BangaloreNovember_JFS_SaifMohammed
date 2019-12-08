package com.cap.forestmanagement.services;

import com.cap.forestmanagement.dao.DAOCustomer;
import com.cap.forestmanagement.factory.Factory;

public class CustomerServicesImpl implements CustomerServices{
	
	DAOCustomer dao=Factory.objectDAOCustomer();

	@Override
	public void addCustomer(Integer customerid, String customerName, String customerAddress, String customerTown,
			int customerZip, String customerEmail, int customerPhone) {
		
		dao.addCustomer(customerid, customerName, customerAddress, customerTown, customerZip, customerEmail, customerPhone);
	}

	@Override
	public void showCustomers() {
		
		dao.showCustomers();
	}

	@Override
	public void removeCustomer(Integer customerid) {
		
		dao.removeCustomer(customerid);
	}

	@Override
	public boolean modifyDetails(Integer customerId) {
		
		return dao.modifyDetails(customerId);
	}

}
