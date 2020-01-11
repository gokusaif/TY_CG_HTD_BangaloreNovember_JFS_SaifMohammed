package com.capgemini.retailermaintainencesystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "userinfo")
public class User {
	
	@Id
	@Column
	@GeneratedValue
	private int id;
	
	@Column
	private String name;
	
	@Column(unique = true)
	private String email;
	
	@Column
	private String password;   

}
