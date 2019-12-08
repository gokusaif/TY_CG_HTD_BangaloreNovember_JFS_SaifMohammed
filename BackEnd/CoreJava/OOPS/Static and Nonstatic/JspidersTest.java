package staticNonstatic;

public class JspidersTest {
	 public static void main(String ar[] ){
		 Jspiders BTM = new Jspiders();
		 BTM.swipe();
		 BTM.swipe();
		 Jspiders BTR = new Jspiders();
		 BTR.swipe();
		 BTR.swipe();
		 System.out.println("The total branch students are "+Jspiders.totalStudents);
		 System.out.println("The BTM branch students are "+BTM.branchStudents);
		 System.out.println("The BTR branch students are "+BTR.branchStudents);
		 
		 
	 }

}
