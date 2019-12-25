package com.capgemini.forestmanagement.dao;

import com.capgemini.forestmanagement.bean.LandDetails;

public interface DAOLand {
	
	public void addDetails(LandDetails l);
	
	public void removeContract(Integer landId);
	
	public void displayDetails();
	
	public boolean modifyContract(LandDetails l);
	
	public LandDetails getLandDetails(Integer landId);


}
