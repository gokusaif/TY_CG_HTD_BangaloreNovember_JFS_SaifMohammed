package com.cap.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.cap.springcore.beans.Author;
import com.cap.springcore.beans.Book;
import com.cap.springcore.beans.Cat;
import com.cap.springcore.beans.Dog;
import com.cap.springcore.beans.Hello;
import com.cap.springcore.beans.Pet;

@Configuration
public class BeansConfig {
	
	@Bean("hello")
//	@Scope("prototype")
	public Hello getHello() {
		Hello hello = new Hello();
		hello.setMessage("I love Spring");
		hello.setCount(10000);
		return hello;
	}
	
	@Bean(name="dog")
	public Dog getDog() {
		return new Dog();
	}
	
	@Bean(name="cat")
	@Primary
	public Cat getCat() {
		return new Cat();
	}
	
	@Bean("pet")
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setName("Doggy");
//		pet.setAnimal(getDog());
		return pet;
	}
	@Bean(name="author")
	public Author getAuthor() {
		Author author= new Author();
		author.setName("Sir Arthur Conan Doyle");
		return author;
	}
	
	@Bean(name="book")
	public Book getBook() {
		Book book = new Book();
		book.setName("Sherlock Holmes");
		return book;
	}
}
