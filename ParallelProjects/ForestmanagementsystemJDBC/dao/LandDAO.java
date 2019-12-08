package com.cap.forestmanagementsystemjdbc.dao;

import java.util.List;

import com.cap.forestmanagementsystemjdbc.bean.LandBean;

public interface LandDAO {
	
public boolean deleteLandDetails(int landId);
	
	public boolean addLandDetails(LandBean land);
	
	public List<LandBean> showLandDetails();
	
	public boolean updateLandDetails(int landId,int landValue);

}
