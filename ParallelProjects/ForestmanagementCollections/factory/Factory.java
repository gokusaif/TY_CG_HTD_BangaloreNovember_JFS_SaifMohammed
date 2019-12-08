package com.cap.forestmanagement.factory;

import com.cap.forestmanagement.dao.DAO;
import com.cap.forestmanagement.dao.DAOCustomer;
import com.cap.forestmanagement.dao.DAOCustomerImpl;
import com.cap.forestmanagement.dao.DAOImpl;
import com.cap.forestmanagement.dao.DAOLand;
import com.cap.forestmanagement.dao.DAOLandImpl;
import com.cap.forestmanagement.services.ClientServices;
import com.cap.forestmanagement.services.ClientServicesImpl;
import com.cap.forestmanagement.services.CustomerServices;
import com.cap.forestmanagement.services.CustomerServicesImpl;
import com.cap.forestmanagement.services.LandServices;
import com.cap.forestmanagement.services.LandServicesImpl;

public class Factory {
	
	private Factory(){
		
	}
	
	public static DAO objectDAO() {
		DAO dao= new DAOImpl();
		return dao;
	}
	
	public static ClientServices objectServices() {
		ClientServices clientServices= new ClientServicesImpl();
		return clientServices;
	}
	
	public static DAOCustomer objectDAOCustomer() {
		DAOCustomer daoc=new DAOCustomerImpl();
		return daoc;
	}
	
	public static CustomerServices objectCustomerServices() {
		CustomerServices servicesC=new CustomerServicesImpl();
		return servicesC;
	}
    public static DAOLand objectDAOLand() {
    	DAOLand daol= new DAOLandImpl();
    	return daol;
    }
    
    public static LandServices objectLandServices() {
		LandServices servicesL=new LandServicesImpl();
		return servicesL;
	}
}
