package checkedexp;

public class IRCTC {
	
	void bookTicket() throws ClassNotFoundException {
		try {
			Class c1= Class.forName("CheckedExp.PayTm");
			System.out.println("ticket is confirmed");
		} catch (ClassNotFoundException e) {
			System.out.println("ticket not confirmed");
		 throw e;
		}
	
	}

}
