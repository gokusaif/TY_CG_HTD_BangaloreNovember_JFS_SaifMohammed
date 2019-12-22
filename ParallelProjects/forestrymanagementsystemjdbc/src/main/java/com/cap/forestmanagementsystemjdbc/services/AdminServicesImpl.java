package com.cap.forestmanagementsystemjdbc.services;

import java.util.List;

import com.cap.forestmanagementsystemjdbc.bean.AdminBean;
import com.cap.forestmanagementsystemjdbc.dao.AdminDAO;
import com.cap.forestmanagementsystemjdbc.factory.Factory;

public class AdminServicesImpl implements AdminServices {

	AdminDAO adminDao = Factory.adminDaoObject();
	
	public boolean addClient(AdminBean admin) {
		
		return adminDao.addClient(admin);
	}

	
	public boolean removeClient(String userName) {
		
		return adminDao.removeClient(userName);
	}

	
	public List<AdminBean> showClients() {
	
		return adminDao.showClients();
	}

}
