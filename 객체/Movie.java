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
		System.out.println("제목 : "+title+"\t감독 : "+director+"\n평점 :"+rating+"\n개봉일 :"+year);
	}
}