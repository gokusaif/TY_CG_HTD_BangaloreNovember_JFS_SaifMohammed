import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList3 {
	public static void main(String[] args) {
		ArrayList<Double> c1 = new ArrayList<Double>();
		
		c1.add(3.14);
		System.out.println("--add");

		System.out.println(c1);
		System.out.println("--contains"); 
		System.out.println(c1.contains(3.14));
		System.out.println("--size");

		System.out.println(c1.size());
		System.out.println("--remove");

		
		c1.remove(3.14);
		System.out.println(c1);
		System.out.println("--isempty");

		
		System.out.println(c1.isEmpty());
		
		System.out.println("---add all---");
		ArrayList<Double> c2 = new ArrayList<Double>();
		
		c2.add(3.14);
		c2.add(4.12);
		c2.add(6.24);
		System.out.println(c2);
		ArrayList <Double> c3= new ArrayList<Double>();
		c3.add(4.12);
		c3.add(6.24);
		c3.add(5.68);
		System.out.println(c3);
		c2.addAll(c3);
		System.out.println(c2);
		System.out.println("---remove all---");
		c2.removeAll(c3);
		System.out.println(c2);
		System.out.println("---retain all---");
	ArrayList<Double> c4 = new ArrayList<Double>();
		
			c4.add(4.12);
			c4.add(6.24);
			c4.add(5.68);
		System.out.println(c4);
		ArrayList <Double> c5= new ArrayList<Double>();
		c5.add(3.14);
		c5.add(4.12);
		c5.add(6.24);
		System.out.println(c5);
		c4.retainAll(c5);
		System.out.println(c4);
		System.out.println("---contains all---");
		ArrayList <Double> c6= new ArrayList<Double>();
		c6.add(3.14);
		c6.add(4.12);
		c6.add(6.24);
		System.out.println(c6);
		ArrayList <Double> c7= new ArrayList<Double>();
	

		c7.add(3.14);
		c7.add(4.12);
		c7.add(6.24);
		
		System.out.println(c6.containsAll(c7));
		
		ArrayList<Double> c8= new ArrayList<Double>();
		//add
		System.out.println("add------");
		c8.add(0, 3.14);
		c8.add(1, 4.28);
		c8.add(2, 6.89);
		c8.add(3, 3.45);
		c8.add(4, 6.89);

		System.out.println(c8);
		//remove
		System.out.println("remove-----");

	   c8.remove(3);
		System.out.println(c8);
		//indexof
		System.out.println("indexof------");

		System.out.println(c8.indexOf(6.89));
		//last index of
		System.out.println("lastindexof------");

		System.out.println(c8.lastIndexOf(6.89));		
		ArrayList <Double> c9= new ArrayList<Double>();
		c9.add(0, 3.14);
		c9.add(1, 4.68);
		c9.add(2, 7.24);
		System.out.println(c9);
		ArrayList <Double> c10= new ArrayList<Double>();
		c10.add(0, 2.56);
		c10.add(1, 7.87);
		c10.add(2, 1.25);
		System.out.println(c10);
		//add all
		System.out.println("add all------");

		c9.addAll(1,c10);
		System.out.println(c9);
		//set
		System.out.println("set------");

		c10.set(2,31.2);
		System.out.println(c10);
		//sublist
		System.out.println("sublist------");
		List c11 =c10.subList(0,3);
		System.out.println(c11);
		
		System.out.println("-----for");
		for(int i=0;i<c7.size();i++) {
			System.out.println(c10.get(i));
		}
		System.out.println("-----foreach");
		for(Double s1:c9) {
			System.out.println(s1);
		}		
		System.out.println("-----iterator");
		ListIterator <Double> itr = c10.listIterator();
	 while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	 System.out.println("reverse--");
	 while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
		
	}

}
