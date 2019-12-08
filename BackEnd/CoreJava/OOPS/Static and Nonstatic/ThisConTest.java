package staticNonstatic;

public class ThisConTest {
	public static void main(String[] args) {
		ThisCon c= new ThisCon("Saif","Dell",90000);
		System.out.println("The name is "+c.name);
		System.out.println("the company is "+c.cmpName);
		System.out.println("The salary is "+c.sal);
		
	}

}
