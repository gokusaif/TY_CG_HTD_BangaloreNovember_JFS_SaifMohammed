import java.util.Vector;

public class Vector4 {
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.addElement(28);
		v1.addElement(45);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		v1.trimToSize();
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		v1.ensureCapacity(4);
		v1.setSize(8);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		System.out.println(v1);
	}

}
