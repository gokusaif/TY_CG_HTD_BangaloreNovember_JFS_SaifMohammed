package com.capgemini.forestmanagement.factory;

import com.capgemini.forestmanagement.dao.AdminDao;
import com.capgemini.forestmanagement.dao.AdminDaoImpl;
import com.capgemini.forestmanagement.dao.ClientDAO;
import com.capgemini.forestmanagement.dao.DAOCustomer;
import com.capgemini.forestmanagement.dao.DAOCustomerImpl;
import com.capgemini.forestmanagement.dao.ClientDAOImpl;
import com.capgemini.forestmanagement.dao.DAOLand;
import com.capgemini.forestmanagement.dao.DAOLandImpl;
import com.capgemini.forestmanagement.dao.ProductDAO;
import com.capgemini.forestmanagement.dao.ProductDAOImpl;
import com.capgemini.forestmanagement.dao.SchedulerDao;
import com.capgemini.forestmanagement.dao.SchedulerDaoImpl;
import com.capgemini.forestmanagement.services.AdminServices;
import com.capgemini.forestmanagement.services.AdminServicesImpl;
import com.capgemini.forestmanagement.services.ClientServices;
import com.capgemini.forestmanagement.services.ClientServicesImpl;
import com.capgemini.forestmanagement.services.CustomerServices;
import com.capgemini.forestmanagement.services.CustomerServicesImpl;
import com.capgemini.forestmanagement.services.LandServices;
import com.capgemini.forestmanagement.services.LandServicesImpl;
import com.capgemini.forestmanagement.services.ProductServices;
import com.capgemini.forestmanagement.services.ProductServicesImpl;
import com.capgemini.forestmanagement.services.SchedulerServices;
import com.capgemini.forestmanagement.services.SchedulerServicesImpl;

public class Factory {

	private Factory(){

	}

	public static ClientDAO objectDAO() {
		ClientDAO dao= new ClientDAOImpl();
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

	public static ProductDAO objectProductDAO() {
		ProductDAO daop= new ProductDAOImpl();
		return daop;
	}

	public static ProductServices objectProductServices() {
		ProductServices servicesp= new ProductServicesImpl();
		return servicesp;
	}

	public static AdminDao objectAdminDao(){
		AdminDao dao= new AdminDaoImpl();
		return dao;
	}

	public static AdminServices objectAdminServices(){
		AdminServices services = new AdminServicesImpl();
		return services;
	}
	
	public static SchedulerDao objectSchedulerDao() {
		SchedulerDao dao = new SchedulerDaoImpl();
		return dao;
	}
	
	public static SchedulerServices objectSchedulerServices() {
		SchedulerServices services= new SchedulerServicesImpl();
		return services;
	}

}
