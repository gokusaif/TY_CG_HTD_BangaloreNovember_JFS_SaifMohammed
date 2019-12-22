package com.cap.forestmanagementsystemjdbc.bean;

import java.io.Serializable;

import lombok.Data;
@Data
public class LandBean implements Serializable {
	private int landId;
	private String landLocation;
	private int landValue;
	private String acquiredDate;
}
