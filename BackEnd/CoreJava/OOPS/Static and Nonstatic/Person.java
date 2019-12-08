package staticNonstatic;

public class Person {
	
	static int age;
	String name;
	void personDetails() {
		System.out.println("The name of person is "+name+" the age is "+age);
	    Person.personDetailss();
	}
	
	static void personDetailss() {
		
		System.out.println(age);
		
	}

}
