package com.cap.webapp.dao;

import java.util.List;

import com.cap.webapp.beans.EmployeeInfoBean;

public interface EmployeeDao {

	public EmployeeInfoBean searchEmployee(int empId);
	
	public EmployeeInfoBean authenticate(int empId ,String password);
	
	public boolean addEmployee(EmployeeInfoBean eBean);
	
	public boolean deleteEmployee(int empId);
	
	public boolean updateEmployee(EmployeeInfoBean eBean);

	public List<EmployeeInfoBean> getAllEmployees();

}
