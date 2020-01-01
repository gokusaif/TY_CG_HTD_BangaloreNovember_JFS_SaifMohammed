package com.capgemini.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.capgemini.springrest.dao.EmployeeDao;
import com.capgemini.springrest.dto.EmployeeAddressBean;
import com.capgemini.springrest.dto.EmployeeBean;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	BCryptPasswordEncoder encoder= new BCryptPasswordEncoder();
	
	@Autowired
	private EmployeeDao dao;
	
	@Override
	public EmployeeBean auth(String email, String password) {
		
		return dao.auth(email,password);
	}

	@Override
	public boolean register(EmployeeBean bean) {
		String encodePassword=encoder.encode(bean.getPassword());
		bean.setPassword(encodePassword);
		List<EmployeeAddressBean> l1=bean.getOther();
		for (EmployeeAddressBean employeeAddressBean : l1) {
			employeeAddressBean.setBean(bean);
		}
		return dao.register(bean);
	}

	@Override
	public List<EmployeeBean> getAllEmployees(String key) {
		
		return dao.getAllEmployees(key);
	}

	@Override
	public boolean changePassword(int id, String password) {
		String encodePassword=encoder.encode(password);
		return dao.changePassword(id,encodePassword);
	}

	@Override
	public boolean deleteEmployee(int id) {
		return dao.deleteEmployee(id);
	}

}
