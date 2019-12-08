package com.cap.forestmanagement.dao;

public interface DAOCustomer {
	
	public void addCustomer(Integer customerid,
	  String customerName,
	  String customerAddress,
	  String customerTown,
	  int customerZip,
	  String customerEmail,
	  int customerPhone);
	
	public void showCustomers();
	public void removeCustomer(Integer customerid);
	
	public boolean modifyDetails(Integer customerId);

}
