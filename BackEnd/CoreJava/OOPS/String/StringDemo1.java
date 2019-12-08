
public class StringDemo1 {
	public static void main(String[] args) {
		
		String s1= new String("john");
		System.out.println(s1.hashCode());
		String s2=new String("tom");
		s1= new String("dog");
		String s3 = new String("john");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		
		
	}

}
