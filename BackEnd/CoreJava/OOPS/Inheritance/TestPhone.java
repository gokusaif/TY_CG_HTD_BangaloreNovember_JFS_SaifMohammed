
public class TestPhone {
	public static void main(String[] args) {
		FirstGen fg=new FirstGen();
		fg.call();
		fg.msg();
		FirstGen sg= new SecondGen();
		sg.call();
		sg.msg();
		//sg.radio();
		SecondGen tg= new ThirdGen();
		tg.call();
		tg.msg();
		tg.radio();
		//tg.camera();
		
		
	}

}
