
public class Book {
	int ISDN;
	String title,author;
	public Book(int iSDN, String title, String author) {
		ISDN = iSDN;
		this.title = title;
		this.author = author;
	}
	public int getISDN() {
		return ISDN;
	}
	public void setISDN(int iSDN) {
		ISDN = iSDN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String  getLateFee(int del){
		return "1일 연체료: "+del*100;
	}
	
}
