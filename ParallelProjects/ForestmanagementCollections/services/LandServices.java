package com.cap.forestmanagement.services;

import com.cap.forestmanagement.bean.LandDetails;

public interface LandServices {
	
	public void addDetails(Integer landId,LandDetails l);
	
	public void displayDetails();
	
	public void removeContract(Integer landId);

}
