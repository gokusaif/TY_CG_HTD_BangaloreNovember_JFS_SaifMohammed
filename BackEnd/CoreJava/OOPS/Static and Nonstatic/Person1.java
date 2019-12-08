package staticNonstatic;

public class Person1 {
	int age;
	String name;
	void display() {
		System.out.println("name is "+name+" age is "+age);
	}
	void initialize(int a,String n)
	{
		age=a;
		name=n;
	}
}
