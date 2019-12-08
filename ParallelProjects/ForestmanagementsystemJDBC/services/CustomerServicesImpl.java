package com.cap.forestmanagementsystemjdbc.services;

import java.util.List;

import com.cap.forestmanagementsystemjdbc.bean.CustomerBean;
import com.cap.forestmanagementsystemjdbc.dao.CustomerDAO;
import com.cap.forestmanagementsystemjdbc.factory.Factory;

public class CustomerServicesImpl implements CustomerServices{
	CustomerDAO dao= Factory.customerDaoObject();

	@Override
	public boolean addCustomer(CustomerBean customer) {

		return dao.addCustomer(customer);
	}

	@Override
	public boolean deleteCustomer(int customerId) {
	
		return dao.deleteCustomer(customerId);
	}

	@Override
	public List<CustomerBean> showCustomers() {
		
		return dao.showCustomers();
	}

	@Override
	public boolean updateAddress(CustomerBean cust) {
		
		return dao.updateAddress(cust);
	}

	@Override
	public boolean updateContact(CustomerBean cust) {

		return dao.updateContact(cust);
	}
}
