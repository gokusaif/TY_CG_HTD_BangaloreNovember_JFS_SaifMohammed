package customexception;

public class AtmSim {
	
	void withdraw(double amount) {
		if(amount>40000) {
			throw new DayLimitException("user limit exceeded");
		}
	}

}
