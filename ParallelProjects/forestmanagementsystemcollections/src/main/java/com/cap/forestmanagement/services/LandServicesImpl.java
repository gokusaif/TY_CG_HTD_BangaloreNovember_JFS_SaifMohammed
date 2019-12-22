package com.cap.forestmanagement.services;

import com.cap.forestmanagement.bean.LandDetails;
import com.cap.forestmanagement.dao.DAOLand;
import com.cap.forestmanagement.factory.Factory;

public class LandServicesImpl implements LandServices{

	DAOLand dao=Factory.objectDAOLand();

	@Override
	public void addDetails(LandDetails l) {
		dao.addDetails(l);
		
	}

	@Override
	public void displayDetails() {
		dao.displayDetails();
		
	}

	@Override
	public void removeContract(Integer landId) {
		dao.removeContract(landId);
		
	}

	@Override
	public boolean modifyContract(LandDetails l) {
		
		return dao.modifyContract(l);
	}

	@Override
	public LandDetails getLandDetails(Integer landId) {

		return dao.getLandDetails(landId);
	}
}
