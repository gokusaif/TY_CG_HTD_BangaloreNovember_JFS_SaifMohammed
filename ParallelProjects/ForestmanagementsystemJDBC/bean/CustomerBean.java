package com.cap.forestmanagementsystemjdbc.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class CustomerBean implements Serializable{
	private int customerid;
	private String customerName;
	private String customerAddress;
	private String customerTown;
	private int customerZip;
	private String customerEmail;
	private int customerPhone;
}
