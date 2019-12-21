package com.cap.forestmanagementsystemjdbc.services;

import java.util.List;

import com.cap.forestmanagementsystemjdbc.bean.ClientBean;
import com.cap.forestmanagementsystemjdbc.dao.ClientDAO;
import com.cap.forestmanagementsystemjdbc.factory.Factory;

public class ClientServicesImpl implements ClientServices {
    ClientDAO clientDao= Factory.clientDaoObject();
	
	public boolean addContract(ClientBean client) {
		
		return clientDao.addContract(client);
	}

	
	public boolean deleteContract(int contractId) {
		
		return clientDao.deleteContract(contractId);
	}

	
	public List<ClientBean> showContracts() {
		
		return clientDao.showContracts();
	}

	
	public boolean updateProductId(int contractId,int productId) {
		
		return clientDao.updateProductId(contractId,productId);
	}

	
	public boolean clientLogin(String username, String password) {
		
		return clientDao.clientLogin(username, password);
	}


	
	public boolean updateHaulierId(int contractId, int haulierId) {
		
		return clientDao.updateHaulierId(contractId, haulierId);
	}


	
	public boolean updateDeliveryDate(int contractId, String deliveryDate) {
		
		return clientDao.updateDeliveryDate(contractId, deliveryDate);
	}


	
	public boolean updateDeliveryDay(int contractId, String deliveryDay) {
		
		return clientDao.updateDeliveryDay(contractId, deliveryDay);
	}


	
	public List<ClientBean> viewContracts(int contractId) {
		
		return clientDao.viewContracts(contractId);
	}



}
