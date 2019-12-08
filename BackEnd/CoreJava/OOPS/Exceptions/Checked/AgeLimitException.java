package checkedexp;

public class AgeLimitException extends Exception{

	String msg="Age should be greater than 18";

	public AgeLimitException(String msg) {
		super();
		this.msg = msg;
	}

	public AgeLimitException() {
		super();
	}
	
	public String getMessage() {
		return msg;
	}
	
	
	
}
