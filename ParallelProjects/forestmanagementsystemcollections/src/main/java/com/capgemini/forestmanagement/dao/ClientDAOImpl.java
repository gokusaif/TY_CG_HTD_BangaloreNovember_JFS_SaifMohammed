package com.capgemini.forestmanagement.dao;

import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.DefaultEditorKit.CutAction;

import com.capgemini.forestmanagement.bean.ContractDetails;
import com.capgemini.forestmanagement.bean.CustomerDetails;

import java.util.Set;
import java.util.TreeMap;

public class ClientDAOImpl implements ClientDAO {

TreeMap<Integer,ContractDetails> l1= new TreeMap<Integer,ContractDetails>();
	
	public void contractDetails(ContractDetails con) {
	
		if(l1.containsKey(con.getContractNo())) {
			System.err.println("duplicate entry for contract id");
		} else {
			l1.put(con.getContractNo(),con);
			System.out.println("contract added");
		}
	}
	
	public void showAll(){
			if(l1.size()!=0) {
			  Set<Map.Entry<Integer, ContractDetails>> s1= l1.entrySet();
			  for (Map.Entry<Integer, ContractDetails> entry : s1) {
				System.out.println(entry.getValue());
			}
			}else {
				System.out.println("no data");
			}
	
	}

	@Override
	public void removeContract(Integer contractId) {

		  if(l1.containsKey(contractId)){
			   l1.remove(contractId);
			   System.out.println("contract removed");
		   } else {
			   System.out.println("contract not found");
		   }
}

	@Override
	public boolean modifyContract(ContractDetails det) {
		
		l1.put(det.getContractNo(),det);
		return true;
		
	}

	@Override
	public ContractDetails getContract(Integer id) {
		if(l1.containsKey(id)) {
			return l1.get(id);
		}
		return null;
	}
}



