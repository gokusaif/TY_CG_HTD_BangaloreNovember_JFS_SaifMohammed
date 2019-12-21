package com.cap.forestmanagementsystemjdbc.bean;


import lombok.Data;

@Data
public class CustomerBean {
	private int customerid;
	private String customerName;
	private String customerAddress;
	private String customerTown;
	private int customerZip;
	private String customerEmail;
	private String customerPhone;
}
