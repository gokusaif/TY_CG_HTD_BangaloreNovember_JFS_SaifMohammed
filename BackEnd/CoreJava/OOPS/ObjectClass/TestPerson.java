
public class TestPerson extends Person {
	

	
	public TestPerson(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Throwable {
		System.out.println("main started");
		Person p1=new Person("saif");
		TestPerson p2=new TestPerson("saif");
		p2.finalize();
		p1.finalize();
		p1=null;
		System.gc();
		System.out.println("main ended");
	}
	

}
