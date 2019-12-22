package com.cap.forestmanagementsystemjdbc.services;

import java.util.List;

import com.cap.forestmanagementsystemjdbc.bean.LandBean;
import com.cap.forestmanagementsystemjdbc.dao.LandDAO;
import com.cap.forestmanagementsystemjdbc.factory.Factory;

public class LandServicesImpl implements LandServices{
	
	LandDAO dao=Factory.landDaoObject();

	
	public boolean deleteLandDetails(int landId) {
		
		return dao.deleteLandDetails(landId);
	}


	public boolean addLandDetails(LandBean land) {
	
		return dao.addLandDetails(land);
	}


	public List<LandBean> showLandDetails() {
		
		return dao.showLandDetails();
	}

	
	public boolean updateLandDetails(int landId, int landValue) {
		
		return dao.updateLandDetails(landId, landValue);
	}

	
	public List<LandBean> viewLandDetails(int landId) {
		
		return dao.viewLandDetails(landId);
	}

}
