package com.cap.springcore.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Hello hello = context.getBean(Hello.class);
		
		System.out.println(hello.getMessage());
		System.out.println(hello.getCount());
		
		context.close();
	}
}
