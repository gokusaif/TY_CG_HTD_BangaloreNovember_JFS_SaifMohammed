package com.cap.forestmanagement.dao;

import java.util.ArrayList;

import com.cap.forestmanagement.bean.ContractDetails;

public interface DAO {
	
	public void contractDetails(Integer productId,int contractNo,int customerId,int haulierId,
			String deliveryDate,String deliveryDay,int quantity);
	public void removeContract(Integer productId);
	public void showAll();
	public boolean modifyContract(Integer productId);

}
