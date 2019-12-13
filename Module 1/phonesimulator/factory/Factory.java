package com.cap.phonesimulator.factory;

import com.cap.phonesimulator.dao.CRUDDao;
import com.cap.phonesimulator.dao.CRUDDaoImpl;

public class Factory {


	public static CRUDDao objectCRUDDaoImpl() {
		CRUDDao dao= new CRUDDaoImpl();
		return dao;
	}

}
