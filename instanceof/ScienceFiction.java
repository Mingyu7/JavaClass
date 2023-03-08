
public class ScienceFiction extends Book {

	public ScienceFiction(int iSDN, String title, String author) {
		super(iSDN, title, author);
	}
	public String  getLateFee(int del){
		super.getLateFee(1);
		return "1일 연체료: "+del*600;
	}
}
