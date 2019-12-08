import java.util.LinkedList;

public class LinkedList3 {
	public static void main(String[] args) {
		LinkedList l1= new LinkedList(); 
		l1.add(2);
		l1.add(43);
		l1.add(2);
		l1.add(65);
		l1.push(10);
		System.out.println("push"+l1);
		l1.pop();
		System.out.println("pop"+l1);
		System.out.println(	"element:"+l1.element());
	}

}
