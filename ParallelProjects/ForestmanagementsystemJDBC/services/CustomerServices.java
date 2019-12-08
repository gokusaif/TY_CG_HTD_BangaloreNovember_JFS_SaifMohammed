package com.cap.forestmanagementsystemjdbc.services;

import java.util.List;

import com.cap.forestmanagementsystemjdbc.bean.CustomerBean;

public interface CustomerServices {
	
	public boolean addCustomer(CustomerBean customer);

	public boolean deleteCustomer(int customerId);

	public List<CustomerBean> showCustomers();

	public boolean updateAddress(CustomerBean cust);

	public boolean updateContact(CustomerBean cust);


}
