package com.cap.webapp.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee_info")
public class EmployeeInfoBean {
	@Id
	@Column(name="eid_id")
	private int empId;
	@Column
	private String name;
	@Column
	private double salary;
	@Column
	private int age;
	@Column
	private String password;
	@Column
	private String designation;
}
