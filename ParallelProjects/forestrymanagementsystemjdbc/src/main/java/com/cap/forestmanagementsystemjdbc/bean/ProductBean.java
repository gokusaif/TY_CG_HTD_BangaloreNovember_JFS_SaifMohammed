package com.cap.forestmanagementsystemjdbc.bean;

import java.io.Serializable;

import lombok.Data;
@Data
public class ProductBean implements Serializable {
	private int productId;
	private String productName;
	private String productQuantity;
	@Override
	public String toString() {
		return "productId=" + productId + " productName=" + productName + ", productQuantity="
				+ productQuantity ;
	}
	
	
}
