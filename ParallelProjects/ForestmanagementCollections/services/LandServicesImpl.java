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
}
