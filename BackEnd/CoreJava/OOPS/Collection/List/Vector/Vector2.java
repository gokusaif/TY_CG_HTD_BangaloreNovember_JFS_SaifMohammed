import java.util.Vector;

public class Vector2 {
public static void main(String[] args) {
	Vector v1=new Vector();
	System.out.println(v1.size());
	System.out.println(v1.capacity());
	System.out.println("---------");
	v1.add(28);
	v1.add(45);
	v1.add(76);
	v1.add(98);
	System.out.println(v1.size());
	System.out.println(v1.capacity());
	System.out.println("---------");
	v1.trimToSize();
	System.out.println(v1.size());
	System.out.println(v1.capacity());
	System.out.println("---------");
	v1.setSize(10);
	System.out.println(v1);
	System.out.println(v1.size());
	System.out.println(v1.capacity());
    System.out.println("-----------");
    v1.add(205);
    System.out.println(v1);
    v1.set(6,300);
    System.out.println(v1);
}
}
