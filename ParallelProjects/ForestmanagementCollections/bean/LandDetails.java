package com.cap.forestmanagement.bean;

import java.io.Serializable;

import lombok.Data;
@Data
public class LandDetails implements Serializable{
	
	private int landId;
	private String landLocation;
	private int landValue;
	private String acquiredDate;

}
