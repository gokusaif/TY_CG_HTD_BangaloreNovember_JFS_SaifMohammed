import java.io.FileInputStream;


public class FIleRead1 {
	public static void main(String[] args) {
		try {
			FileInputStream f1 = new FileInputStream("john.txt");
			
			int j=0;
			while((j=f1.read())!=-1) {
				System.out.print((char)j);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
