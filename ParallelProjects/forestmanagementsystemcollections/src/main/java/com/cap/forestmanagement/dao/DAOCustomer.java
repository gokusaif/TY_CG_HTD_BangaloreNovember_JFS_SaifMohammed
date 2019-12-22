package com.cap.forestmanagement.dao;

import com.cap.forestmanagement.bean.CustomerDetails;

public interface DAOCustomer {
	
	public void addCustomer(CustomerDetails details);
	
	public void showCustomers();
	public void removeCustomer(Integer customerid);
	
	public boolean modifyDetails(Integer id,CustomerDetails details);
	
	public CustomerDetails getDetails(Integer iD);

}
