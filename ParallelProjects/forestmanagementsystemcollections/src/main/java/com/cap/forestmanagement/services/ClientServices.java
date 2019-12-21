package com.cap.forestmanagement.services;

import com.cap.forestmanagement.bean.ContractDetails;

public interface ClientServices {
	
	public void contractDetails(ContractDetails con);
	public void removeContract(Integer productId);
	public void showAll();
	public boolean modifyContract(ContractDetails con);
	public ContractDetails getContract(Integer id);

}
