
public class ImmutableClass {
	
	  private int age;
	  private String name;
	
	  public ImmutableClass(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	  
	  public  String getname() {
		  return this.name;
	  }

	  public int getage() {
		  return this.age;
	  }
}
