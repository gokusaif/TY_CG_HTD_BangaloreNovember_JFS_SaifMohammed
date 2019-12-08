package staticNonstatic;

public class Student1 {
	
	public static void main(String[] args) {
		
		Student s=new Student();
		System.out.println("Age is "+s.studAge);
		System.out.println("The name is "+s.studName);
		Student s1=new Student("Saif",23);
		System.out.println("Age is "+s1.studAge);
		System.out.println("The name is "+s1.studName);
		
		
	}

}
