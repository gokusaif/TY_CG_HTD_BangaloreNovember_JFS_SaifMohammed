package staticNonstatic;

public class Employee {
	int age;
	String name;
	double salary;
	
	void display()
	{
		System.out.println("The name is "+name+"The age is "+age+"The salary is "+salary);
	}
	Employee(int a,String n,double s)
	{ age=a;
	name=n;
	salary=s;
	
}
}
