package exceptions;

public class C {
	
	
	static void m() {
		try {
		System.out.println(10/0);
	} catch (ArithmeticException ae) {
		System.out.println(ae.getMessage()+" C");
		throw ae;
	}

}
}