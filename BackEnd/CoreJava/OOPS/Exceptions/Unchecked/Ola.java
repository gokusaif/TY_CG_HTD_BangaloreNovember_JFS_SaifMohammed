package exceptions;

public class Ola {
	GoogleMap g1;

	public Ola(GoogleMap g1) {
		super();
		this.g1 = g1;
	}
	
	void find(String a) {
		try {
		g1.findlocation(a);
		
	} catch (NullPointerException n) {
		System.out.println("ola user provide location");
	}
		

}}
