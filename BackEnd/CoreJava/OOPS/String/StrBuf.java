
public class StrBuf {
	
	public static void main(String[] args) {
		StringBuffer s1= new StringBuffer("saif");
		System.out.println(s1.hashCode());
		s1= s1.append("mohd");
		System.out.println(s1.hashCode());
	}

}
