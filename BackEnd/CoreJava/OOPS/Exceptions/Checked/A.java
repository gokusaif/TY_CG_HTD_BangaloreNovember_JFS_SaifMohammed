package checkedexp;

public class A {
public static void main(String[] args) {
	try {
		B.n();
	} catch (ClassNotFoundException e) {
		System.out.println("class not found");
	}
}
}
