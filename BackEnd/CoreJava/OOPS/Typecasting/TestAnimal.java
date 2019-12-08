package com.tyss.typecasting.pack1;

public class TestAnimal {
	public static void main(String[] args) {
		
		Animal a=new Dog();
		a.eat();
		
		Dog d=(Dog) a;
		d.eat();
		d.walk();
		 
		 Animal a1= new Lion();
		Lion l=(Lion) a1;
		l.eat();
		l.run();
	}

}
