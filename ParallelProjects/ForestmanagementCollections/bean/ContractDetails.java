package com.cap.forestmanagement.bean;

import java.io.Serializable;

import lombok.Data;
@Data
public class ContractDetails implements Serializable{
	private Integer productId;
	private int contractNo;
	private int customerId;
	private int haulierId;
	private String deliveryDate;
	private String deliveryDay;
	private int quantity;

	

}
