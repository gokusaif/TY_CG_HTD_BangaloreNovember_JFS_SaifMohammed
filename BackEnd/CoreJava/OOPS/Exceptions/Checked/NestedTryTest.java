package checkedexp;

public class NestedTryTest {
	public static void main(String[] args) {
		System.out.println("started");
		NestedTry n1= new NestedTry();
		try {
			Object o1= n1.clone();
			System.out.println("cloned");
		try {
			Class c1= Class.forName("Person");
			System.out.println("class found");
		} catch (ClassNotFoundException e) {
			System.out.println("class not found");
		}
		
		} catch (CloneNotSupportedException e) {
			System.out.println("clone not supported");
		}
		System.out.println("ended");
	}

}
