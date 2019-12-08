
public class TestA {
	public static void main(String[] args) {
		int i=10;
		Integer i1= new Integer(i);  //boxing
	    int i2=i1.intValue();         //unboxing
	    
	    
	    double d=3.14;
	    Double d1= new Double(d); //boxing
	    double d2=d1.doubleValue(); //unboxing
	    
	    System.out.println(i);
	    System.out.println(i1);
	    System.out.println(i2);
	    System.out.println(d);
	    System.out.println(d1);
	    System.out.println(d2);
		
	}

}
