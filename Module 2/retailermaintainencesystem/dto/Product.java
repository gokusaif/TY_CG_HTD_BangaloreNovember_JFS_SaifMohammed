package com.capgemini.retailermaintainencesystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name = "productinfo")
public class Product {
	
	@Id
	@GeneratedValue
	@Column
	private int id;
		
	@Column(unique = true)
	private String name;
	
	@Column
	private int quantity;
	
	@Column
	private String price;


}
