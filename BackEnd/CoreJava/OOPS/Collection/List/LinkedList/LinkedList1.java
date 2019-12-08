import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList l1= new LinkedList(); 
		l1.add(2);
		l1.add(43);
		l1.add(2);
		l1.add(65);
		l1.add(null);
		
		ListIterator ltr= l1.listIterator();
		System.out.println("---iterator");
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		
		l1.remove(new Integer(43));
		System.out.println(l1);
		System.out.println("---for each");
		
		for (Object i1 : l1) {
			System.out.println(i1);
		}
		
	}

}
