package com.cap.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cap.springcore.beans.Book;
import com.cap.springcore.config.BeansConfig;

public class TestBook {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
		
		Book book = context.getBean(Book.class);
		System.out.println("book name is "+book.getName());
		System.out.println("Author name is "+book.getAuthor().getName());
		
	}

}
