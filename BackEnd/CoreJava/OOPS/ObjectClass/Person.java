
public class Person {
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}


	protected void finalize() throws Throwable {
     System.out.println("finalize");
		super.finalize();
	}
	
	
//	public static void main(String[] args) throws Throwable {
//		System.out.println("main started");
//		Person p1=new Person("saif");
//		p1.finalize();
//		p1=null;
//		System.gc();
//		System.out.println("main ended");
//	}


}
