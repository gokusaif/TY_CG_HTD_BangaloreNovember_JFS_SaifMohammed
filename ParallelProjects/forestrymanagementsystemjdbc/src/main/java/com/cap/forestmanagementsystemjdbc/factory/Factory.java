package com.cap.forestmanagementsystemjdbc.factory;

import com.cap.forestmanagementsystemjdbc.dao.AdminDAO;
import com.cap.forestmanagementsystemjdbc.dao.AdminDAOImpl;
import com.cap.forestmanagementsystemjdbc.dao.ClientDAO;
import com.cap.forestmanagementsystemjdbc.dao.ClientDAOImpl;
import com.cap.forestmanagementsystemjdbc.dao.CustomerDAO;
import com.cap.forestmanagementsystemjdbc.dao.CustomerDAOImpl;
import com.cap.forestmanagementsystemjdbc.dao.LandDAO;
import com.cap.forestmanagementsystemjdbc.dao.LandDAOImpl;
import com.cap.forestmanagementsystemjdbc.dao.ProductDAO;
import com.cap.forestmanagementsystemjdbc.dao.ProductDAOImpl;
import com.cap.forestmanagementsystemjdbc.dao.SchedulerDAO;
import com.cap.forestmanagementsystemjdbc.dao.SchedulerDAOImpl;
import com.cap.forestmanagementsystemjdbc.services.AdminServices;
import com.cap.forestmanagementsystemjdbc.services.AdminServicesImpl;
import com.cap.forestmanagementsystemjdbc.services.ClientServices;
import com.cap.forestmanagementsystemjdbc.services.ClientServicesImpl;
import com.cap.forestmanagementsystemjdbc.services.CustomerServices;
import com.cap.forestmanagementsystemjdbc.services.CustomerServicesImpl;
import com.cap.forestmanagementsystemjdbc.services.LandServices;
import com.cap.forestmanagementsystemjdbc.services.LandServicesImpl;
import com.cap.forestmanagementsystemjdbc.services.ProductServices;
import com.cap.forestmanagementsystemjdbc.services.ProductServicesImpl;
import com.cap.forestmanagementsystemjdbc.services.SchedulerServices;
import com.cap.forestmanagementsystemjdbc.services.SchedulerServicesImpl;

public class Factory {
	
	public static ProductDAO productDaoObject() {
		ProductDAO prodDao=new ProductDAOImpl();
		return prodDao;
	}
	
	public static ProductServices productServicesObject() {
		ProductServices services=new ProductServicesImpl();
		return services ;
	}
	
	public static AdminDAO adminDaoObject() {
		AdminDAO adminDao= new AdminDAOImpl();
		return adminDao;
	}
	
	public static AdminServices adminServicesObject() {
		AdminServices adminServices= new AdminServicesImpl();
		return adminServices;
	}
	
	public static ClientDAO clientDaoObject() {
		ClientDAO clientDao= new ClientDAOImpl();
		return clientDao;
	}
	
	public static ClientServices clientServicesObject() {
		ClientServices clientServices= new ClientServicesImpl();
		return clientServices;
	}
	
	public static LandDAO landDaoObject() {
		LandDAO landDao= new LandDAOImpl();
		return landDao;
	}
	
	public static LandServices landServicesObject() {
		LandServices landServices= new LandServicesImpl();
		return landServices;
	}
	
	public static SchedulerDAO schedulerDaoObject() {
		SchedulerDAO schedulerDao=new SchedulerDAOImpl();
		return schedulerDao;
	}
	
	public static SchedulerServices schedulerServicesObject() {
		SchedulerServices schedulerServices=new SchedulerServicesImpl();
		return schedulerServices;
	}
	
	public static CustomerServices customerServicesObject() {
		CustomerServices customerServices = new CustomerServicesImpl();
		return customerServices;
	}
	
	public static CustomerDAO customerDaoObject() {
		CustomerDAO customerServices = new CustomerDAOImpl();
		return customerServices;
	}
	

}
