package com.capgemini.forestmanagement.services;

import com.capgemini.forestmanagement.bean.ClientBean;
import com.capgemini.forestmanagement.bean.SchedulerBean;
import com.capgemini.forestmanagement.bean.SchedulerLogin;

public interface AdminServices {

	
	public void addClient(ClientBean bean);
	
	public void showClients();
	
	public void removeclient(String username);
	
	public boolean checkClient(String username,String password);
	
	public void showClient(String username);
	
	public void updateClient(ClientBean bean);
	
	public void addScheduler(SchedulerLogin bean);

	public void showSchdeuler();

	public void removeSheduler(String username);

	public boolean checkScheduler(String username,String password);
	
	public void showScheduler(String username);
	
	public void updateScheduler(SchedulerLogin bean);
	

}
