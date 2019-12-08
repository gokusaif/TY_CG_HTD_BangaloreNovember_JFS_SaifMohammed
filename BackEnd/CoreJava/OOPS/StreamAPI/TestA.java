import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestA {
	public static void main(String[] args) {
		System.out.println("---predicate---");
	 Predicate<Integer> p= i-> i%2==0;
//	 boolean b= p.test(12);
	 System.out.println(p.test(12));
	 System.out.println(p.test(45));
	 
	 System.out.println("----function----");
	 Function<Integer, Integer> f= i-> i*100;
//	 int i1=f.apply(75);
	 System.out.println(f.apply(75));
	 
	 System.out.println("---supplier");
	 Supplier<Person> s1= () -> new Person(24,"john");
	 System.out.println(s1.get().getAge());
	 System.out.println(s1.get().getName());
	 
	 System.out.println("----consumer----");
	 Consumer<Person> c1= i -> {
		 System.out.println(i.getAge()); 
		 System.out.println(i.getName());
	 };
	 Person p1= new Person(23,"john");
	 c1.accept(p1);
	
	
	}
}
