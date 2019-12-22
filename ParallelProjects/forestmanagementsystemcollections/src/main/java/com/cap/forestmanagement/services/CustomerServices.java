package com.cap.forestmanagement.services;

import com.cap.forestmanagement.bean.CustomerDetails;

public interface CustomerServices {

	public void addCustomer(CustomerDetails details);

	public void showCustomers();
	public void removeCustomer(Integer customerid);

	public boolean modifyDetails(Integer id,CustomerDetails details);
	
	public CustomerDetails getDetails(Integer iD);

}
