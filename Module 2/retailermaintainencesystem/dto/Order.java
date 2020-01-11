package com.capgemini.retailermaintainencesystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Table(name = "orderinfo")
@Entity
public class Order {
	
	@Id
	@Column
	@GeneratedValue
	private int id;
	
	@Exclude
	@OneToOne
	@JoinColumn
	private Product productId;
	
	@Exclude
	@OneToOne
	@JoinColumn
	private User userid;

}
