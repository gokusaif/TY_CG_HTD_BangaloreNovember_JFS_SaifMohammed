package com.capgemini.forestmanagement.bean;

import java.io.Serializable;

import lombok.Data;
@Data
public class ContractDetails implements Serializable{
	private Integer contractNo;
	private int customerId;
	private int productId;
	private int quantity;
	private String deliveryDate;
	@Override
	public String toString() {
		return " contractNo = " + contractNo + "\n customerId = " + customerId + "\n productId = " + productId
				+ "\n quantity = " + quantity + "\n deliveryDate = " + deliveryDate + "\n";
	}
	
	
	

	

}
