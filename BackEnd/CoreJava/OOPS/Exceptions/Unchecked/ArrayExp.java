package exceptions;

public class ArrayExp {
	public static void main(String[] args) {
		System.out.println("main started");
	int [] a= new int[3];
	a[0]=10;
	a[1]=10;
	a[2]=10;
	try {
		a[3]=10;
	} catch (ArrayIndexOutOfBoundsException ar)
	{
		System.out.println("no space");
	}
	
	
	
			
			
			
	System.out.println("main started");	
			
	}
		
			
}