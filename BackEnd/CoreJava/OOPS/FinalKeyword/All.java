
public abstract class all {
	
	   final int c;
	   static final int d;
	  all(){
		  System.out.println("constructor is executed");
	  }
	  
	  {
		  System.out.println("Instance block");
		  c=20;
	  }
	  
	  static
	  {
		  System.out.println("static block");
		  d=10;
	  }

}
