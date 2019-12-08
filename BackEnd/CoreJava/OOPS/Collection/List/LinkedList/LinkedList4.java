import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkedList4 {
	public static void main(String[] args) {
		System.out.println("---linked list---");
		LinkedList<String> l1= new LinkedList<String>(); 
		l1.add("john");
		l1.add("sam");
		l1.add("watson");
		l1.add("sherlock");
		System.out.println(l1);
		System.out.println("add 1st and last---");
		l1.addFirst("saif");
		l1.addLast("kaif");
		System.out.println(l1);
		System.out.println("---get first &  last");
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		System.out.println("---remove,remove first and last");
		l1.remove();
		l1.removeFirst();
		l1.removeLast();
		System.out.println(l1);
	     l1.add("saif");
		System.out.println(l1);
		System.out.println("--remove 1st occ and last occ");
		l1.removeFirstOccurrence("saif");
		l1.removeLastOccurrence("saif");
		System.out.println(l1);
		
		System.out.println("---peek ,peek 1st and last----");
		System.out.println(l1);
		System.out.println(l1.peek());
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());

		System.out.println("----poll,poll first and poll last----");
		System.out.println(l1);
		System.out.println(l1.poll());
		System.out.println(l1.pollFirst());
		System.out.println(l1.pollLast());
		System.out.println("--offer ,offer 1st last");
		System.out.println(l1);
		l1.offer("ali");
		l1.offerLast("khan");
		l1.offerFirst("don");
		System.out.println(l1);
		System.out.println("--list---");
		
		LinkedList<String> l2= new LinkedList<String>(); 
		l2.add("john");
		l2.add("sam");
		l2.add("watson");
		l2.add("sherlock");
		l2.add("sam");
		
		System.out.println(l2);
		//remove
		l2.remove(2);
		System.out.println(l2);
		//indexof
		System.out.println(l2.indexOf("sam"));
		//last index of
		System.out.println(l2.lastIndexOf("sam"));
		System.out.println(l2);
		//set
		l2.set(2,"dan");
		System.out.println(l2);
		//sublist
		List l3 =l2.subList(0,3);
		System.out.println(l3);
		//get
		System.out.println("-------");
		for(int i=0;i<l2.size();i++) {
			System.out.println(l2.get(i));
		}
    System.out.println("---collections--");
	LinkedList<String> l4= new LinkedList<String>(); 
	l4.add("john");
	l4.add("sam");
	l4.add("watson");
	System.out.println(l4.contains("sam"));
	l4.remove("sam");
	System.out.println(l4);
	System.out.println(l4.isEmpty());
	System.out.println(l4.size());
	System.out.println("---add all---");
	LinkedList<String> l5= new LinkedList<String>(); 
	l5.add("john");
	l5.add("sam");
	l5.add("watson");
	l5.addAll(l4);
	System.out.println(l5);
	System.out.println("---remove all---");
	l5.removeAll(l4);
	System.out.println(l5);
	System.out.println("---retain all---");
	LinkedList<String> l6= new LinkedList<String>(); 
	l6.add("john");
	l6.add("sam");
	l6.add("watson");
	l4.retainAll(l6);
	System.out.println(l4);
	System.out.println("---contains all---");
	System.out.println(l4.containsAll(l6));
	Object a[]=l4.toArray();
	
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+",");
	}
	


	}
}
