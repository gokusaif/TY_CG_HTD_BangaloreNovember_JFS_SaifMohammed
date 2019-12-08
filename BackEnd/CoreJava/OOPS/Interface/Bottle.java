
public interface Bottle {
	
	void open();
	void drink();
	
	static void close()
	{
		System.out.println("Close the bottle");
	}
	
	default void juice() {
		
		System.out.println("Drinking juice");  
	}

}
