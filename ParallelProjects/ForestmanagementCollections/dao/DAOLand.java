package com.cap.forestmanagement.dao;

import com.cap.forestmanagement.bean.LandDetails;

public interface DAOLand {
	
	public void addDetails(Integer landId,LandDetails l);
	
	public void removeContract(Integer landId);
	
	public void displayDetails();

}
