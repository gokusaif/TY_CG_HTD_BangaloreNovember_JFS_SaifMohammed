package com.cap.forestmanagementsystemjdbc.bean;

import java.io.Serializable;

import lombok.Data;
@Data
public class SchedulerBean implements Serializable{
	private int schedulerId;
	private	String transport;
	private String date;
	private	int	productId;
	private String quantity;

}
