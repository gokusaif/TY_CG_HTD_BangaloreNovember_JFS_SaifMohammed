package com.cap.forestmanagement.bean;

import java.io.Serializable;

import lombok.Data;
@Data
public class CustomerDetails implements Serializable {
	private Integer customerid;
	private String customerName;
	private String customerAddress;
	private String customerTown;
	private int customerZip;
	private String customerEmail;
	private int customerPhone;
	
	
}
