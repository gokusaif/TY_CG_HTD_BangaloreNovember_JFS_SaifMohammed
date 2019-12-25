package com.capgemini.forestmanagement.bean;

import java.io.Serializable;

import lombok.Data;
@Data
public class ProductDetails implements Serializable {
	private Integer productId;
	private String productName;
	private String units;
	private int productQuantity;
	@Override
	public String toString() {
		return " productId = " + productId + "\n productName = " + productName + "\n units = " + units
				+ "\n productQuantity = " + productQuantity + "\n";
	}
	
	
}
