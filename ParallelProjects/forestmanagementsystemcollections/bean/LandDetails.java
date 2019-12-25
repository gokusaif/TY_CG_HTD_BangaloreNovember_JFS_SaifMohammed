package com.capgemini.forestmanagement.bean;

import java.io.Serializable;

import lombok.Data;
@Data
public class LandDetails implements Serializable{
	
	private Integer landId;
	private String landLocation;
	private int landValue;
	private String acquiredDate;
	@Override
	public String toString() {
		return " landId = " + landId + "\n landLocation = " + landLocation + "\n landValue = " + landValue
				+ "\n acquiredDate = " + acquiredDate + "\n";
	}
	
	

	

}
