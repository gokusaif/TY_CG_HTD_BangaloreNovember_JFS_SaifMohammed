package com.capgemini.forestmanagement.dao;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.capgemini.forestmanagement.bean.ClientBean;
import com.capgemini.forestmanagement.bean.SchedulerBean;
import com.capgemini.forestmanagement.bean.SchedulerLogin;

public class AdminDaoImpl implements AdminDao{


	TreeMap<String, String> client= new TreeMap<String, String>();
	TreeMap<String, String> scheduler= new TreeMap<String, String>();

	public void addClient(ClientBean bean) {
		if(client.containsKey(bean.getUsername())) {
			System.err.println("Duplicate entry for client account");
		} else {
			client.put(bean.getUsername(),bean.getPassword());
			System.out.println("Client account created");
		}

	}
	@Override
	public void showClients() {
		if(client.size()!=0) {
			Set<Map.Entry<String, String>> s1=client.entrySet();
			for (Map.Entry<String, String> entry : s1) {
				System.out.println("--------------");
				System.out.println("Client username :"+entry.getKey());
				System.out.println("Client password :"+entry.getValue());
				System.out.println("---------------\n");
			}
		} else {
			System.out.println("no data");
		}

	}
	@Override
	public void removeclient(String username) {
		if(client.containsKey(username)) {
			client.remove(username);
			System.out.println("client account deleted");
		} else {
			System.out.println("client account not found");
		}

	}
	@Override
	public boolean checkClient(String username, String password) {
		if(client.containsKey(username)&&client.containsValue(password)) {
			return true;
		}
		return false;
	}
	@Override
	public void addScheduler(SchedulerLogin bean) {
		if(scheduler.containsKey(bean.getUsername())) {
			System.err.println("Duplicate entry for scheduler account");
		} else {
			scheduler.put(bean.getUsername(),bean.getPassword());
			System.out.println("Scheduler account created");
		}
	}
	@Override
	public void showSchdeuler() {
		if(scheduler.size()!=0) {
			Set<Map.Entry<String, String>> s1=scheduler.entrySet();
			for (Map.Entry<String, String> entry : s1) {
				System.out.println("--------------");
				System.out.println("Scheduler username :"+entry.getKey());
				System.out.println("Scheduler password :"+entry.getValue());
				System.out.println("---------------\n");
			}
		} else {
			System.out.println("no data");
		}

	}


	@Override
	public boolean checkScheduler(String username, String password) {
		if(scheduler.containsKey(username)&&scheduler.containsValue(password)) {
			return true;
		}
		return false;
	}
	@Override
	public void removeSheduler(String username) {
		if(scheduler.containsKey(username)) {
			scheduler.remove(username);
			System.out.println("Scheduler account deleted");
		} else {
			System.out.println("Scheduler account not found");
		}
	}
	@Override
	public void showClient(String username) {
		if(client.containsKey(username)) {
			System.out.println("Username is "+username);
			String password=client.get(username);
			System.out.println("Password is "+password);
		} else {
			System.out.println("Client account not found");
		}

	}
	@Override
	public void showScheduler(String username) {
		if(scheduler.containsKey(username)) {
			System.out.println("Username is "+username);
			String password=scheduler.get(username);
			System.out.println("Password is "+password);
		} else {
			System.out.println("Scheduler account not found");
		}


	}
	@Override
	public void updateClient(ClientBean bean) {
		
		client.put(bean.getUsername(), bean.getPassword());
		System.out.println("Password updated");
	}
	@Override
	public void updateScheduler(SchedulerLogin bean) {
		
		scheduler.put(bean.getUsername(), bean.getPassword());
		System.out.println("Password updated");
	}


}

