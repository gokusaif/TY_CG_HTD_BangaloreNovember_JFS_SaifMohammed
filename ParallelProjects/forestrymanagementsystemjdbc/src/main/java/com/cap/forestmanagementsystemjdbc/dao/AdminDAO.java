package com.cap.forestmanagementsystemjdbc.dao;

import java.util.List;

import com.cap.forestmanagementsystemjdbc.bean.AdminBean;

public interface AdminDAO {

	public boolean addClient(AdminBean admin);
	
	public boolean removeClient(String userName);
	
	public List<AdminBean> showClients();
}
