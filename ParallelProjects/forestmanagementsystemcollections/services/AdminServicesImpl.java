package com.capgemini.forestmanagement.services;

import com.capgemini.forestmanagement.bean.ClientBean;
import com.capgemini.forestmanagement.bean.SchedulerBean;
import com.capgemini.forestmanagement.bean.SchedulerLogin;
import com.capgemini.forestmanagement.dao.AdminDao;
import com.capgemini.forestmanagement.factory.Factory;

public class AdminServicesImpl implements AdminServices{

	AdminDao dao= Factory.objectAdminDao();
	@Override
	public void addClient(ClientBean bean) {
		dao.addClient(bean);
	}

	@Override
	public void showClients() {
	dao.showClients();	
	}

	@Override
	public void removeclient(String username) {
		dao.removeclient(username);
	}

	@Override
	public boolean checkClient(String username, String password) {

		return dao.checkClient(username, password);
	}

	@Override
	public void addScheduler(SchedulerLogin bean) {
		dao.addScheduler(bean);
		
	}

	@Override
	public void showSchdeuler() {
		dao.showSchdeuler();
		
	}

	@Override
	public void removeSheduler(String username) {
	dao.removeSheduler(username);
		
	}

	@Override
	public boolean checkScheduler(String username, String password) {
		
		return dao.checkScheduler(username, password);
	}

	@Override
	public void showClient(String username) {
		dao.showClient(username);
		
	}

	@Override
	public void showScheduler(String username) {
		dao.showScheduler(username);
		
	}

	@Override
	public void updateClient(ClientBean bean) {
		
		dao.updateClient(bean);
	}

	@Override
	public void updateScheduler(SchedulerLogin bean) {
		
		dao.updateScheduler(bean);
	}


}
