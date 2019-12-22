package com.cap.webapp.service;

import java.util.List;

import com.cap.webapp.beans.EmployeeInfoBean;
import com.cap.webapp.dao.EmployeeDao;
import com.cap.webapp.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDao dao= new EmployeeDaoImpl();
	@Override
	public EmployeeInfoBean searchEmployee(int empId) {
		
		return dao.searchEmployee(empId);
	}
	@Override
	public EmployeeInfoBean authenticate(int empId, String password) {
		
		return dao.authenticate(empId, password);
	}
	@Override
	public boolean addEmployee(EmployeeInfoBean eBean) {
	
		return dao.addEmployee(eBean);
	}
	@Override
	public boolean deleteEmployee(int empId) {
		
		return dao.deleteEmployee(empId);
	}
	@Override
	public boolean updateEmployee(EmployeeInfoBean eBean) {
		
		return dao.updateEmployee(eBean);
	}
	@Override
	public List<EmployeeInfoBean> getAllEmployees() {
	
		return dao.getAllEmployees();
	}

}
