
public class TestAnimal {
public static void main(String[] args) {
	Cat c=new Cat();
	c.eat();
	
	Lion l=new Lion();
	l.eat();
	
	Animal a=new Cat();
	a.eat();
	
	Animal a1= new Lion();
	a1.eat();
	
	Animal a2= new Animal();
	a2.eat();
}
}
