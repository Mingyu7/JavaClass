
public class Poet extends Book {

	public Poet(int iSDN, String title, String author) {
		super(iSDN, title, author);
	}
	public String  getLateFee(int del){
		super.getLateFee(1);
		return "1�� ��ü��: "+del*200;
	}
}
