package com.cap.forestmanagementsystemjdbc.bean;

import java.io.Serializable;

import lombok.Data;
@Data
public class AdminBean implements Serializable {
	private String clientUserName;
	private String clientPassword;
	@Override
	public String toString() {
		return "clientUserName=" + clientUserName;
	}
	
	
	
}
