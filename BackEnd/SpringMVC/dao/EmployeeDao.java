package com.cap.empspringmvc.dao;

import java.util.List;

import com.cap.empspringmvc.beans.EmployeeBean;

public interface EmployeeDao {
	public EmployeeBean auth(String email,String password);
	public boolean register(EmployeeBean bean);
	public List<EmployeeBean> getAllEmployees(String key);
	public boolean changePassword(int id,String password);
}
