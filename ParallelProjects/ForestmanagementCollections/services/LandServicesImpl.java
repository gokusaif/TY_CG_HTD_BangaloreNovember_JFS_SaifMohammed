package com.cap.forestmanagement.services;

import com.cap.forestmanagement.bean.LandDetails;
import com.cap.forestmanagement.dao.DAOLand;
import com.cap.forestmanagement.factory.Factory;

public class LandServicesImpl implements LandServices{

	DAOLand dao=Factory.objectDAOLand();

	@Override
	public void addDetails(Integer landId,LandDetails l) {
		dao.addDetails(landId,l);
		
	}

	@Override
	public void displayDetails() {
		dao.displayDetails();
		
	}

	@Override
	public void removeContract(Integer landId) {
		dao.removeContract(landId);
		
	}
}
