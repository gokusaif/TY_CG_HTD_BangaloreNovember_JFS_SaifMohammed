import java.util.Vector;

public class Vector3 {
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.addElement(28);
		v1.addElement(45);
		v1.addElement(76);
		v1.addElement(98);
		v1.add(23);
		System.out.println(v1);
		v1.remove(new Integer(76));
		System.out.println(v1);
		v1.removeElementAt(3);
		System.out.println(v1);
		Object a1[]=new Object[v1.size()];
		v1.copyInto(a1);
		for(int i=0;i<a1.length;i++) {
			System.out.println(a1[i]);
		}
	}
}
