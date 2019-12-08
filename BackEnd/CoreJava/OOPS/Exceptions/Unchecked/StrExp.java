package exceptions;

public class StrExp {
	
	void write() {
		String s1;
		s1=null;
		try {
		System.out.println("the lenght of s1 is"+s1.length());
		} catch (NullPointerException n) {
			System.out.println("string length cannot be calculated for null string.");
		}
		
	}
	
	
	public static void main(String[] args) {
		StrExp s1= new StrExp();
		System.out.println("main started");
		s1.write();
		System.out.println("main ended");
	}

}
