package com.capgemini.forestmanagement.bean;

import lombok.Data;

@Data
public class SchedulerBean {
	private int id;
	private int clientId;
	private int productId;
	private int quantity;
	private String transport;
	private String deliveryDate;
	@Override
	public String toString() {
		return " Scheduler id = " + id + "\n clientId = " + clientId + "\n productId = " + productId + "\n quantity = "
				+ quantity + "\n transport = " + transport + "\n deliveryDate = " + deliveryDate + "\n";
	}
	
	
}
