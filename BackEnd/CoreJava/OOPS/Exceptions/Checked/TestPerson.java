package checkedexp;

public class TestPerson {
	
	public static void main(String[] args) {
		
		
		try {
			Class c1= Class.forName("CheckedExp.Person");
			System.out.println("class found");
		} catch (ClassNotFoundException e) {
			System.out.println("class not found");
		}
		
		
		
		
	}

}
