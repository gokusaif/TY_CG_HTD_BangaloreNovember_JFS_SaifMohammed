package com.capgemini.forestmanagement.services;

import com.capgemini.forestmanagement.bean.CustomerDetails;

public interface CustomerServices {

	public void addCustomer(CustomerDetails details);

	public void showCustomers();
	
	public void removeCustomer(Integer customerid);

	public boolean modifyDetails(Integer id,CustomerDetails details);
	
	public CustomerDetails getDetails(Integer iD);

}
