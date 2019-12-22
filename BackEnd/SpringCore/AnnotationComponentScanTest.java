package com.cap.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cap.springcore.beans.Animal;
import com.cap.springcore.beans.Pet;
import com.cap.springcore.config.ComponentScanConfig;

public class AnnotationComponentScanTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
		
		Animal animal = context.getBean(Animal.class);
		animal.sound();
		
		Pet pet = context.getBean(Pet.class);
		pet.getAnimal().sound();
	}
}
