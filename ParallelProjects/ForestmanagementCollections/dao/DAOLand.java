package com.cap.forestmanagement.dao;

import com.cap.forestmanagement.bean.LandDetails;

public interface DAOLand {
	
	public void addDetails(LandDetails l);
	
	public void removeContract(Integer landId);
	
	public void displayDetails();

}
