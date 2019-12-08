package staticNonstatic;

public class PersonTest {
	public static void main(String ar[]) {
		Person p1=new Person();
		Person.age=25;
		p1.name="John";
		p1.personDetails();
		
	}

}
