package com.cap.forestmanagement.dao;



import com.cap.forestmanagement.bean.ContractDetails;

public interface DAO {
	
	public void contractDetails(ContractDetails con);
	public void removeContract(Integer productId);
	public void showAll();
	public boolean modifyContract(ContractDetails con);
	public ContractDetails getContract(Integer id);
}
