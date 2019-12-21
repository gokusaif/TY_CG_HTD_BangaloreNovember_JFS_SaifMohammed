package com.cap.forestmanagement.services;

import com.cap.forestmanagement.bean.LandDetails;

public interface LandServices {
	
	public void addDetails(LandDetails l);
	
	public void displayDetails();
	
	public void removeContract(Integer landId);
	
	public boolean modifyContract(LandDetails l);
	
	public LandDetails getLandDetails(Integer landId);

}
