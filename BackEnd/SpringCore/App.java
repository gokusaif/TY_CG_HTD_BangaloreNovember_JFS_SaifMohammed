package com.cap.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cap.springcore.beans.Animal;

import com.cap.springcore.beans.Hello;
import com.cap.springcore.beans.Pet;

public class App 
{
	public static void main( String[] args )
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Hello hello = context.getBean(Hello.class);
		
		Hello hello1 = context.getBean(Hello.class);
		
		System.out.println(hello==hello1);
		System.out.println(hello);
		System.out.println(hello1);
		System.out.println(hello.getMessage());
		System.out.println(hello.getCount());
		System.out.println("-------------------");
		
		Animal animal = context.getBean(Animal.class);
		animal.sound();
		System.out.println("-------------");
		Pet pet = context.getBean(Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().sound();
		
	}
}
