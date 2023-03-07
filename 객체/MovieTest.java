public class MovieTest {

	public static void main(String[] args) {
		Movie mo1=new Movie();
		mo1.setTitle("±«¹°");
		mo1.setDirector("ºÀÁØÈ£");
		mo1.rating=9.9;
		mo1.year=2006;
		mo1.print();
		System.out.println("-----------------------------");
		Movie mo2=new Movie();
		mo2.setTitle("¸¶¼Ç");
		mo2.setDirector("¸®µé¸® ½ºÄà");
		mo2.rating=9.2;
		mo2.year=2015;
		mo2.print();
	}

}
