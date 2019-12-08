import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {
	public static void main(String[] args) {
		
		ArrayList<Integer> a1= new ArrayList<Integer>();
		a1.add(16);
		a1.add(24);
		a1.add(26);
		System.out.println(a1);
		System.out.println("------");
		for(Integer i1:a1) {
			System.out.println(i1);
		}
		System.out.println("iterator -------");
		Iterator <Integer>i1= a1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println("list iterator -------");
		ListIterator <Integer>i2= a1.listIterator(a1.size());
		while(i2.hasPrevious()) {
			System.out.println(i2.previous());
		}
		
	}

}
