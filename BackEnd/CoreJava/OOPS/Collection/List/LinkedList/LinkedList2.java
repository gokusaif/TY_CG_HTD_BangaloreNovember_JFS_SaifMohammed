import java.util.LinkedList;

public class LinkedList2 {
	public static void main(String[] args) {
		LinkedList l1= new LinkedList(); 
		l1.add(2);
		l1.add(43);
		l1.add(2);
		l1.add(65);
		System.out.println(l1);
		System.out.println("add 1st and last---");
		l1.addFirst(13);
		l1.addLast(24);
		System.out.println(l1);
		System.out.println("---get first &  last");
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		System.out.println("---remove,remove first and last");
		l1.remove();
		l1.removeFirst();
		l1.removeLast();
		System.out.println(l1);
		l1.add(2);
		System.out.println(l1);
		System.out.println("--remove 1st occ and last occ");
		l1.removeFirstOccurrence(2);
		l1.removeLastOccurrence(2);
		System.out.println(l1);
		l1.add(2);
		l1.add(43);
		l1.add(2);
		l1.add(65);
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
		l1.offer(2);
		l1.offerLast(24);
		l1.offerFirst(23);
		System.out.println(l1);
		
	}

}
