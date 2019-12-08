package com.cap.forestmanagement.dao;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.cap.forestmanagement.bean.CustomerDetails;

public class DAOCustomerImpl implements DAOCustomer {
	TreeMap<Integer,CustomerDetails> l1=new TreeMap<Integer,CustomerDetails>();

	public void addCustomer(Integer customerid, String customerName, String customerAddress, String customerTown,
			int customerZip, String customerEmail, int customerPhone) {
		CustomerDetails cdet=new CustomerDetails();
		cdet.setCustomerid(customerid);
		cdet.setCustomerName(customerName);
		cdet.setCustomerAddress(customerAddress);
		cdet.setCustomerTown(customerTown);
		cdet.setCustomerZip(customerZip);
		cdet.setCustomerEmail(customerEmail);
		cdet.setCustomerPhone(customerPhone);
		l1.put(customerid,cdet);
		if(l1.size()!=0) {
			System.out.println("customer details added");
		} else {
			System.out.println("not added");
		}
		
	}

	
	public void showCustomers() {
		if(l1.size()!=0) {
			Set<Map.Entry<Integer,CustomerDetails>> s1= l1.entrySet();
			for (Map.Entry<Integer, CustomerDetails> e : s1) {
				System.out.println(e);
			}
		}else {
				System.out.println("no data");
			}
		
	}


	
	public void removeCustomer(Integer customerid) {
	   if(l1.containsKey(customerid)){
		   l1.remove(customerid);
		   System.out.println("customer removed");
	   } else {
		   System.out.println("customer not found");
	   }
	}


	@Override
	public boolean modifyDetails(Integer customerId) {
		
		   if(l1.containsKey(customerId)){
			   
			  return true;
		   } else {
			  return false;
		   }
	}
	
}


