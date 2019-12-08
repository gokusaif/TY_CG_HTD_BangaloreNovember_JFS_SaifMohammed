package com.cap.forestmanagement.services;

import com.cap.forestmanagement.dao.DAO;
import com.cap.forestmanagement.factory.Factory;

public class ClientServicesImpl implements ClientServices {
	
	DAO dao=Factory.objectDAO();

	@Override
	public void contractDetails(Integer productId, int contractNo, int customerId, int haulierId, String deliveryDate,
			String deliveryDay, int quantity) {
		dao.contractDetails(productId, contractNo, customerId, haulierId, deliveryDate, deliveryDay, quantity);
		
	}

	@Override
	public void removeContract(Integer productId) {
	  dao.removeContract(productId);
		
	}

	@Override
	public void showAll() {
		dao.showAll();
		
	}

	@Override
	public boolean modifyContract(Integer productId) {
		
		return dao.modifyContract(productId);
	}

}
