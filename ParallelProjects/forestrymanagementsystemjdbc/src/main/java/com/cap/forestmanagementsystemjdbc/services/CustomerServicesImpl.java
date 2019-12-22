package com.cap.forestmanagementsystemjdbc.services;

import java.util.List;

import com.cap.forestmanagementsystemjdbc.bean.CustomerBean;
import com.cap.forestmanagementsystemjdbc.dao.CustomerDAO;
import com.cap.forestmanagementsystemjdbc.factory.Factory;

public class CustomerServicesImpl implements CustomerServices{
	CustomerDAO dao= Factory.customerDaoObject();

	
	public boolean addCustomer(CustomerBean customer) {

		return dao.addCustomer(customer);
	}

	
	public boolean deleteCustomer(int customerId) {
	
		return dao.deleteCustomer(customerId);
	}

	
	public List<CustomerBean> showCustomers() {
		
		return dao.showCustomers();
	}

	
	public boolean updateAddress(CustomerBean cust) {
		
		return dao.updateAddress(cust);
	}

	
	public boolean updateContact(CustomerBean cust) {

		return dao.updateContact(cust);
	}

	
	public List<CustomerBean> viewCusstomers(int customerId) {
		
		return dao.viewCusstomers(customerId);
	}
}
