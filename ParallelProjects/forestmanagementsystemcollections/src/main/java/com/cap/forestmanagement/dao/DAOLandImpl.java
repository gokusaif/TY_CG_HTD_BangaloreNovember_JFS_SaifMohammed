package com.cap.forestmanagement.dao;



import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.cap.forestmanagement.bean.ContractDetails;
import com.cap.forestmanagement.bean.LandDetails;

public class DAOLandImpl implements DAOLand {

	TreeMap<Integer,LandDetails> l1= new TreeMap<Integer,LandDetails>();


	public void addDetails(LandDetails l) {
		
		if(l1.containsKey(l.getLandId())) {
			System.err.println("duplicate entry for land id");
		} else {
			
			l1.put(l.getLandId(),l);
			System.out.println("details added");
		}

	}



	public void displayDetails() {
		if(l1.size()!=0) {
			Set<Map.Entry<Integer, LandDetails>> s1= l1.entrySet();
			for (Map.Entry<Integer, LandDetails> entry : s1) {
				System.out.println(entry.getValue());
			}
		}else {
			System.out.println("no data");
		}

	}



	@Override
	public void removeContract(Integer landId) {
		if(l1.containsKey(landId)){
			l1.remove(landId);
			System.out.println("land details removed");
		} else {
			System.out.println("land details not found");
		}

	}



	@Override
	public boolean modifyContract(LandDetails l) {
		
		l1.put(l.getLandId(),l);
		
		return true;

	}



	@Override
	public LandDetails getLandDetails(Integer landId) {
		if(l1.containsKey(landId)) {
			return l1.get(landId);
		}
		return null;
	}
}



