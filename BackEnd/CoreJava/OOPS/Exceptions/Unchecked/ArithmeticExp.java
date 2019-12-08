
public class ArithmeticExp {

	void divide(int a,int b) {
		System.out.println("divide method is called");
		
		try {
		System.out.println(a/b);
	} catch(ArithmeticException ae) {
		System.out.println("Divide by zero not possible");
	}
		System.out.println("Divide method ended");
	}
	
	
}
