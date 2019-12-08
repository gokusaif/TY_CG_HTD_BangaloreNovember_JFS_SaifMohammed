
public class InstanceBlock {
	
	final int a;
	
	static final double PI;
	
	InstanceBlock()
	{
		System.out.println("Method is executed");
	}
	
	InstanceBlock(int b)
	{
		System.out.println("method is overloaded");
		
	}
	
	{
		a=3;
		System.out.println("Instance block is executed");
	}
 static {
	 
	 System.out.println("Static initilizer block is executed");
	 PI=3.14;
 }
}
