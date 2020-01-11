package com.capgemini.retailermaintainencesystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.retailermaintainencesystem.dto.Order;
import com.capgemini.retailermaintainencesystem.dto.Product;
import com.capgemini.retailermaintainencesystem.dto.RetailerResponse;
import com.capgemini.retailermaintainencesystem.dto.User;
import com.capgemini.retailermaintainencesystem.services.RetailerServices;

@RestController
public class RetailerController {

	@Autowired
	RetailerServices retailerServices;

	@PostMapping(path = "/register", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public RetailerResponse createUser(@RequestBody User user) {
		RetailerResponse response = new RetailerResponse();
		if (retailerServices.createUser(user)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("User registered");
		}
		return response;
	}

	@PostMapping(path = "/login", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public RetailerResponse login(@RequestBody User credentials) {
		RetailerResponse response = new RetailerResponse();
		User user = retailerServices.login(credentials);
		if (user != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Logged in");
			response.setUser(user);
		} else {
			response.setStatusCode(405);
			response.setMessage("Failure");
			response.setDescription("Enter valid password");
		}
		return response;
	}

	@PostMapping(path = "/insert-product", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public RetailerResponse insertProduct(@RequestBody Product product) {
		RetailerResponse response = new RetailerResponse();
		if (retailerServices.insertProduct(product)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product inserted");
		}
		return response;
	}

	@GetMapping(path = "/view-products", produces = MediaType.APPLICATION_JSON_VALUE)
	public RetailerResponse viewProducts() {
		RetailerResponse response = new RetailerResponse();
		List<Product> product = retailerServices.viewProduct();
		response.setStatusCode(201);
		response.setMessage("Success");
		response.setDescription("Product found");
		response.setProduct(product);
		return response;
	}

	@GetMapping(path = "/view-order/{orderId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public RetailerResponse viewOrder(@PathVariable("orderId") int orderId) {
		RetailerResponse response = new RetailerResponse();
		Order order = retailerServices.viewOrder(orderId);
		if (order != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Order found");
			response.setOrder(order);
		}
		return response;
	}

	@GetMapping(path = "/logout")
	public RetailerResponse logout() {
		RetailerResponse response = new RetailerResponse();
		retailerServices.logout();
		response.setStatusCode(201);
		response.setMessage("Success");
		response.setDescription("Logged out");
		return response;
	}
	
	@GetMapping(path = "/order/{productName}",produces = MediaType.APPLICATION_JSON_VALUE)
	public RetailerResponse order(@PathVariable("productName") String productName) {
		RetailerResponse response = new RetailerResponse();
		if(retailerServices.placeOrder(productName)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Ordered");
		} else {
			response.setStatusCode(405);
			response.setMessage("Failure");
			response.setDescription("Please login first");
		}
		return response;			
	}

}
