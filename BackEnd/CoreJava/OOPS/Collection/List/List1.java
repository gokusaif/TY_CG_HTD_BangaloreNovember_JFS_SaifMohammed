import java.util.ArrayList;
import java.util.List;

public class List1 {
public static void main(String[] args) {
	List l1= new ArrayList();
	//add
	l1.add(0, 12);
	l1.add(1, 32);
	l1.add(2, 45);
	l1.add(3, 34);
	l1.add(4, 12);
	System.out.println("l1"+l1);
	//remove
	l1.remove(2);
	System.out.println(l1);
	//indexof
	System.out.println(l1.indexOf(34));
	//last index of
	System.out.println(l1.lastIndexOf(12));
	//get
	System.out.println("-------");
	for(int i=0;i<l1.size();i++) {
		System.out.println(l1.get(i));
	}
	
	List l2= new ArrayList();
	l2.add(45);
	l2.add(23);
	l2.add(12);
	l2.add(25);
	System.out.println(l2);
	List l3= new ArrayList();
	l3.add(46);
	l3.add(24);
	l3.add(13);
	l3.add(26);
	System.out.println(l3);
	//add all
	l2.addAll(1,l3);
	System.out.println(l2);
	//set
	l3.set(2,67);
	System.out.println(l3);
	//sublist
	List l4 =l3.subList(0,3);
	System.out.println(l4);
	
	
	
	
}
}
