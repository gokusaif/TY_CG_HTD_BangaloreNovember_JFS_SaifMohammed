package com.cap.forestmanagementsystemjdbc.dao;

import java.util.List;

import com.cap.forestmanagementsystemjdbc.bean.ClientBean;

public interface ClientDAO {

	public boolean addContract(ClientBean client);

	public boolean deleteContract(int contractId);

	public List<ClientBean> showContracts();
	
	public List<ClientBean> viewContracts(int contractId);


	public boolean updateProductId(int contractId,int productId);

	public boolean updateHaulierId(int contractId,int haulierId);

	public boolean updateDeliveryDate(int contractId,String deliveryDate);

	public boolean updateDeliveryDay(int contractId,String deliveryDay);

	public boolean clientLogin(String username,String password);


}
