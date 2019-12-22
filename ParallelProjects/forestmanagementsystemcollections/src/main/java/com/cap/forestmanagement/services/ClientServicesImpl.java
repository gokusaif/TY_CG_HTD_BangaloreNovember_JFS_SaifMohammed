package com.cap.forestmanagement.services;

import com.cap.forestmanagement.bean.ContractDetails;
import com.cap.forestmanagement.dao.DAO;
import com.cap.forestmanagement.factory.Factory;

public class ClientServicesImpl implements ClientServices {
	
	DAO dao=Factory.objectDAO();

	

	@Override
	public void removeContract(Integer productId) {
	  dao.removeContract(productId);
		
	}

	@Override
	public void showAll() {
		dao.showAll();
		
	}

	@Override
	public boolean modifyContract(ContractDetails con) {
		
		return dao.modifyContract(con);
	}

	@Override
	public void contractDetails(ContractDetails con) {
		
		dao.contractDetails(con);
		
	}

	

	@Override
	public ContractDetails getContract(Integer id) {
		
		return dao.getContract(id);
	}

	

}
