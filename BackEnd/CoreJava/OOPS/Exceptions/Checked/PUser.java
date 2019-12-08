package checkedexp;

public class PUser {
	public static void main(String[] args) {
		System.out.println("started");
		IRCTC i2= new IRCTC();
		PayTm p1= new PayTm(i2);
		p1.bookTicket();
		System.out.println("ended");
	}
	

}
