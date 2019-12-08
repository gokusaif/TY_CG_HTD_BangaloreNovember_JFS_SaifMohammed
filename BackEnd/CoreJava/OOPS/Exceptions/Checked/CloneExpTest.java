package checkedexp;

public class CloneExpTest {
	
	public static void main(String[] args) {
		System.out.println("started");
		CloneExp c1= new CloneExp();
		try {
			Object o1= c1.clone();
			System.out.println("clone supported");
			Class c2= Class.forName("person");
		} catch (CloneNotSupportedException e) {
		      System.out.println("clone not supported");
	
		}
		catch(ClassNotFoundException a)
		{
			System.out.println("class not found");
		}
		System.out.println("ended");
	}

}
