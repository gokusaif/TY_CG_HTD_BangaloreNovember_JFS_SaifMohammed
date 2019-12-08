package com.cap.forestmanagement.services;

public interface ClientServices {
	
	public void contractDetails(Integer productId,int contractNo,int customerId,int haulierId,
			String deliveryDate,String deliveryDay,int quantity);
	public void removeContract(Integer productId);
	public void showAll();
	public boolean modifyContract(Integer productId);

}
