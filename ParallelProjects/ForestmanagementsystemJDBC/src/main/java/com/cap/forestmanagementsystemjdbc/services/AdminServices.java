package com.cap.forestmanagementsystemjdbc.services;

import java.util.List;

import com.cap.forestmanagementsystemjdbc.bean.AdminBean;

public interface AdminServices {

	public boolean addClient(AdminBean admin);
	
	public boolean removeClient(String userName);
	
	public List<AdminBean> showClients();

}
