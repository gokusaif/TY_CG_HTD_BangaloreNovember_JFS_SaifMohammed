package staticNonstatic;

public class Son extends Father {
	
	Son()
	{   super("Saif",23);
		System.out.println("C");
	}
	
	Son(String name,int age) {
		this();
		System.out.println("D");
	}
	

}
