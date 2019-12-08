package customexception;

public class SBIAtm {
	public static void main(String[] args) {
		System.out.println("started");
		AtmSim a1= new AtmSim();
		try {
			a1.withdraw(41000);
			
		} catch (DayLimitException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("ended");
		
		
	}

}
