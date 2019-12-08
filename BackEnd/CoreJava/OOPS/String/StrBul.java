
public class StrBul {
	public static void main(String[] args) {
		StringBuilder s1= new StringBuilder("saif");
		System.out.println(s1.hashCode());
		s1= s1.append("mohd");
		System.out.println(s1.hashCode());
	}

}
