package customexception;

public class DayLimitException  extends RuntimeException{ 
    
	 String msg="limit exceeds";

	public DayLimitException() {
		super();
	}

	public DayLimitException(String msg) {
		super();
		this.msg = msg;
	}
	 
	public String  getMessage() {
		 return msg;
	 }
	
	
}
