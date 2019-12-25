package com.capgemini.forestmanagement.services;

import com.capgemini.forestmanagement.bean.LandDetails;
import com.capgemini.forestmanagement.dao.DAOLand;
import com.capgemini.forestmanagement.factory.Factory;

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
