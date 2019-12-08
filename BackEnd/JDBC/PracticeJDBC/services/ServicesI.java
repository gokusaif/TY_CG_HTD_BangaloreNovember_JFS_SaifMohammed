package services;

import java.util.List;
import factory.Factory;
import bean.BeanClass;
import dao.DAO;

public class ServicesI implements Services {

	DAO dao=Factory.objectDAO();
	@Override
	public List<BeanClass> getAll() {
		
		return dao.getAll();
	}

}
