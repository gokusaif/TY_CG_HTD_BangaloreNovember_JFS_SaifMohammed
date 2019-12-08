package checkedexp;

public class PayTm {
	IRCTC i1;

	public PayTm(IRCTC i1) {
		super();
		this.i1 = i1;
	}
	
	void bookTicket()
	{
		try {
			i1.bookTicket();
			System.out.println("ticket confirmed");
		} catch (ClassNotFoundException e) {
			System.out.println("ticked not confirmed");
		}
	}
}
