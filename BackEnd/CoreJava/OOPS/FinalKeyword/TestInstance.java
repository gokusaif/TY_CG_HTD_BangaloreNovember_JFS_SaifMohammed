
public class TestInstance {
	
	public static void main(String[] args) {
		
		InstanceBlock i = new InstanceBlock();
		System.out.println(i.a);
		System.out.println(InstanceBlock.PI);
		InstanceBlock i1=new InstanceBlock(10);
		System.out.println(i1.a);
	
	}

}
