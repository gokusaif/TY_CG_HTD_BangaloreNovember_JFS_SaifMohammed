package staticNonstatic;

public class TestPerson {
	 public static void main(String[] args) {
		 Person1 p1= new Person1();
	        p1.age=23;
			p1.name="John";
			p1.display();
			Person1 p2 = new Person1();
			p2.initialize(23, "Saif");
			p2.display();
	}
	

}
