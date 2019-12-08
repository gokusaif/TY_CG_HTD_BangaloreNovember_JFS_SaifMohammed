
public class CalTest {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		int r1=c.add(10);
		int r2=c.add(20, 30);
		double r3=c.add(42.08);
		System.out.println("The result 1 is " +r1);
		System.out.println("The result 2 is "+r2);
		System.out.println("The result 3 is "+r3);
		Calculator.mul(20);
		Calculator.mul(20, 10);
	    Calculator.mul(20.5);
	}

}