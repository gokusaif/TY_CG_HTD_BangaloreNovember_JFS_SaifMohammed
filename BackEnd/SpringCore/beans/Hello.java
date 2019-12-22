package com.cap.springcore.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hello //implements InitializingBean,DisposableBean 
{
	
	
	public Hello() {
//		System.out.println("object of hello created");
	}
	
	public Hello(String message,int count) {
		this.message=message;
		this.count=count;
	}
	private String message;

	public String getMessage() {
		return message;
	}
	
	private int count;

	public int getCount() {
		return count;
	}
	@PostConstruct
	public void init() { //any name
//		System.out.println("init method called");
	}
	@PreDestroy
	public void destroy() { //any name
		System.out.println("destroy");
	}
	
	public void setCount(int count) {
		this.count = count;
	}

	public void setMessage(String message) {
		this.message = message;
	}

//	@Override
//	public void afterPropertiesSet() throws Exception { // init
//		System.out.println("after properties set");
//	}
	
}
