package exceptions;

public class GoogleMap {

	void findlocation(String loc) {
		try {
		System.out.println(loc.length());
		
	} catch (NullPointerException n)
		{
		System.out.println("google user provide location");
		throw n;
		}
		
	
	
	
} }
