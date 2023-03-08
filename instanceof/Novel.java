
public class Novel extends Book {
	
	public Novel(int iSDN, String title, String author) {
		super(iSDN, title, author);
	}

	public String  getLateFee(int del){
		super.getLateFee(1);
		return "1일 연체료: "+del*300;
	}
}
