package controller;

import java.util.List;

import bean.BeanClass;
import factory.Factory;
import services.Services;

public class GetAll {
public static void main(String[] args) {
	Services services=Factory.objectServices();
	
	List<BeanClass> l1= services.getAll();
	if(l1!=null) {
	for (BeanClass beanClass : l1) {
		System.out.println(beanClass);
	}
}
}
}
