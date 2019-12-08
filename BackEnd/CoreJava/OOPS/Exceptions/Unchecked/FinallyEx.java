package exceptions;

public class FinallyEx {
	
 public static void main(String[] args) {
	
System.out.println("started main");
  
	  try {
		  System.out.println(100/0);
	  }
	  catch(ArithmeticException ae) {
		  System.out.println("dont divide by 0");
		
	  }
	  finally {
		  System.out.println("finally block called");
	  }
	  
	  System.out.println("ended");
	  
  
} }
