public class Movie {
	private String title =" ";
	private String director =" ";
	double rating = 0;
	int year = 0;
	
	void setTitle(String title) {
		this.title=title;
	}
	void setDirector(String director) {
		this.director= director;
	}
	void print() {
		System.out.println("���� : "+title+"\t���� : "+director+"\n���� :"+rating+"\n������ :"+year);
	}
}