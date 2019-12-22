package com.cap.forestmanagement.services;

import com.cap.forestmanagement.bean.CustomerDetails;
import com.cap.forestmanagement.dao.DAOCustomer;
import com.cap.forestmanagement.factory.Factory;

public class CustomerServicesImpl implements CustomerServices{
	
	DAOCustomer dao=Factory.objectDAOCustomer();

	@Override
	public void addCustomer(CustomerDetails details) {
		
		dao.addCustomer(details);
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
	public CustomerDetails getDetails(Integer iD) {
		
		return dao.getDetails(iD);
	}

	@Override
	public boolean modifyDetails(Integer id, CustomerDetails details) {
		
		return dao.modifyDetails(id, details);
	}

}
