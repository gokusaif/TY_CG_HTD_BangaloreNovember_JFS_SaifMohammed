
import java.io.FileOutputStream;

public class FileOutput1 {
	public static void main(String[] args) {
		try {
			FileOutputStream f1= new FileOutputStream("john.txt");
			String s1="hello";
			byte[]a= s1.getBytes();
			f1.write(a);
			System.out.println("file created");
		} catch (Exception e) {	
			e.printStackTrace();
		}
	}

}
