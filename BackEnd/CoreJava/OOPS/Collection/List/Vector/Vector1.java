import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(28);
		v1.add(45);
		v1.add(76);
		v1.add(98);
		System.out.println(v1);
		System.out.println("--remove--");
		v1.remove(new Integer(45));
		System.out.println(v1);
		System.out.println("--set---");
		v1.set(2,45);
		System.out.println(v1);




	}

}
