package factory;

import dao.DAO;
import dao.DAOI;
import services.Services;
import services.ServicesI;

public class Factory {
	
	private Factory() {
		
	}
	
	public static DAO objectDAO() {
		DAO dao = new DAOI();
		return dao;
	}
	
	public static Services objectServices() {
		Services services= new ServicesI();
		return services;
	}

}
