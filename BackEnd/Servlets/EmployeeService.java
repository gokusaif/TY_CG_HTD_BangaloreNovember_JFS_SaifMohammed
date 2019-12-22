package com.cap.webapp.service;

import java.util.List;

import com.cap.webapp.beans.EmployeeInfoBean;

public interface EmployeeService {
	
	
	public EmployeeInfoBean searchEmployee(int empId);
	
	public EmployeeInfoBean authenticate(int empId ,String password);
	
	public boolean addEmployee(EmployeeInfoBean eBean);
	public boolean updateEmployee(EmployeeInfoBean eBean);
	public boolean deleteEmployee(int empId);
	public List<EmployeeInfoBean> getAllEmployees();

}
