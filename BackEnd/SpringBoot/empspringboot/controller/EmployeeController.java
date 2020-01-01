package com.capgemini.empspringboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.empspringboot.dto.EmployeeBean;
import com.capgemini.empspringboot.dto.EmployeeResponse;
import com.capgemini.empspringboot.service.EmployeeService;
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping(path="/auth",produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse auth(@RequestBody EmployeeBean bean) {
		EmployeeBean employeeBean= service.auth(bean.getEmail(),bean.getPassword());
		EmployeeResponse response = new EmployeeResponse();
		if(employeeBean!=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee details found for credentials");
			response.setBeans(Arrays.asList(employeeBean));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Credentials invalid");
		}
		return response;
	}

	@PostMapping(path="/register",produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse register(@RequestBody EmployeeBean bean) {
		EmployeeResponse response = new EmployeeResponse();
		if(service.register(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee registered");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Email already exist");
		}
		return response;
	}

	@GetMapping(path="/get",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse searchEmployee(@RequestParam("key") String key) {
		EmployeeResponse response= new EmployeeResponse();
		List<EmployeeBean> list=service.getAllEmployees(key);
		if(!list.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee details found");
			response.setBeans(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Employee details not found");
		}
		return response;
	}

	@PutMapping(path="/change-password",produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)//only when accepting object
	public EmployeeResponse changePassword(@RequestBody EmployeeBean bean) {
		EmployeeResponse response= new EmployeeResponse();
		if(service.changePassword(bean.getEid(), bean.getPassword())) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Password updated");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Password not updated");
		}
		return response;
	}
	
	@DeleteMapping(path="/delete/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmployee(@PathVariable("id") int id) {
		EmployeeResponse response = new EmployeeResponse();
		if(service.deleteEmployee(id)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee deleted");
		}
		return response;
	}

}
