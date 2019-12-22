package com.cap.forestmanagementsystemjdbc.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class ClientBean implements Serializable {
	
	private int contractId;
	private int productId;
	private int haulierId;
	private String deliveryDate;
	private String deliveryDay;

}
