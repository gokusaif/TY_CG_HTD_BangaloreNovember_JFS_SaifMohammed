
public class TestImmu {
public static void main(String[] args) {
	 ImmutableClass i1 = new ImmutableClass(22, "saif");
	 System.out.println(i1.hashCode());
	 i1 = new ImmutableClass(23, "Saif");
	 System.out.println(i1.hashCode());
	 int age=i1.getage();
	 String name=i1.getname();
	 System.out.println(age);
	 System.out.println(name);
	 
	 
}
}
