package com.capgemini.forestmanagement.services;

import com.capgemini.forestmanagement.bean.ContractDetails;
import com.capgemini.forestmanagement.dao.ClientDAO;
import com.capgemini.forestmanagement.factory.Factory;

public class ClientServicesImpl implements ClientServices {
	
	ClientDAO dao=Factory.objectDAO();

	

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
