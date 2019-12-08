import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList2 {
	public static void main(String[] args) {
		ArrayList<String> c1 = new ArrayList<String>();
		
		c1.add("saif");
		System.out.println(c1);
	
		System.out.println(c1.contains("saif"));
		
		System.out.println(c1.size());
		
		c1.remove("saif");
		System.out.println(c1);
		
		System.out.println(c1.isEmpty());
		
		System.out.println("---add all---");
		ArrayList<String> c2 = new ArrayList<String>();
		
		c2.add("john");
		c2.add("sam");
		c2.add("tom");
		System.out.println(c2);
		ArrayList <String> c3= new ArrayList<String>();
		c3.add("dan");
		c3.add("john");
		c3.add("harry");
		System.out.println(c3);
		c2.addAll(c3);
		System.out.println(c2);
		System.out.println("---remove all---");
		c2.removeAll(c3);
		System.out.println(c2);
		System.out.println("---retain all---");
	ArrayList<String> c4 = new ArrayList<String>();
		
		c4.add("john");
		c4.add("sam");
		c4.add("tom");
		System.out.println(c4);
		ArrayList <String> c5= new ArrayList<String>();
		c5.add("dan");
		c5.add("john");
		c5.add("harry");
		System.out.println(c5);
		c4.retainAll(c5);
		System.out.println(c4);
		System.out.println("---contains all---");
		ArrayList <String> c6= new ArrayList<String>();
		c6.add("john");
		c6.add("sam");
		c6.add("tom");
		System.out.println(c6);
		ArrayList <String> c7= new ArrayList<String>();
		c7.add("sam");
		c7.add("john");
		c7.add("tom");
		System.out.println(c6.containsAll(c7));
		
		ArrayList<String> c8= new ArrayList<String>();
		//add
		c8.add(0, "tom");
		c8.add(1, "sam");
		c8.add(2, "charlie");
		c8.add(3, "sam");
		c8.add(4, "charlie");
		System.out.println(c8);
		//remove
	   c8.remove(3);
		System.out.println(c8);
		//indexof
		System.out.println(c8.indexOf("charlie"));
		//last index of
		System.out.println(c8.lastIndexOf("charlie"));		
		ArrayList <String> c9= new ArrayList();
		c9.add(0, "tom");
		c9.add(1, "sam");
		c9.add(2, "charlie");
		System.out.println(c9);
		ArrayList <String> c10= new ArrayList();
		c10.add(0, "tom");
		c10.add(1, "ron");
		c10.add(2, "harry");
		System.out.println(c10);
		//add all
		c9.addAll(1,c10);
		System.out.println(c9);
		//set
		c10.set(2,"don");
		System.out.println(c10);
		//sublist
		List c11 =c10.subList(0,2);
		System.out.println(c11);
		
		System.out.println("-----for");
		for(int i=0;i<c7.size();i++) {
			System.out.println(c10.get(i));
		}
		System.out.println("-----foreach");
		for(String s1:c9) {
			System.out.println(s1);
		}		
		System.out.println("-----iterator");
		ListIterator <String> itr = c10.listIterator();
	 while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	 System.out.println("reverse--");
	 while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
		
	}

}
