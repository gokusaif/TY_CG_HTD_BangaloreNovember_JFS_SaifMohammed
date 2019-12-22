package com.cap.forestmanagement.dao;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.text.DefaultEditorKit.CutAction;

import com.cap.forestmanagement.bean.CustomerDetails;

public class DAOCustomerImpl implements DAOCustomer {
	TreeMap<Integer,CustomerDetails> l1=new TreeMap<Integer,CustomerDetails>();

	public void addCustomer(CustomerDetails details) {
		if(l1.containsKey(details.getCustomerid())) {
			System.err.println("duplicate entry for customer id");
		} else {
			l1.put(details.getCustomerid(),details);
		}

	}


	public void showCustomers() {
		if(l1.size()!=0) {
			Set<Map.Entry<Integer,CustomerDetails>> s1= l1.entrySet();
			for (Map.Entry<Integer, CustomerDetails> e : s1) {
				System.out.println(e.getValue());
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
	public boolean modifyDetails(Integer id,CustomerDetails details) {
		
		l1.put(id,details);
		
		return true;
	}


	@Override
	public CustomerDetails getDetails(Integer iD) {
		if(l1.containsKey(iD)) {
			return l1.get(iD);
		}
		return null;
	}

}


