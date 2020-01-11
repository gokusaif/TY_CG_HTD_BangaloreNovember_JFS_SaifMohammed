package com.capgemini.retailermaintainencesystem.dto;

import java.util.List;

import lombok.Data;

@Data
public class RetailerResponse {

	private int statusCode;
	
	private String message;
	
	private String description;
	
	private User user;
	
	private List<Product> product;
	
	private Order order;
	
}
