
import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Book bk1 = new Book();
		System.out.print("제목 입력>>");
		bk1.setTitle(sc.next());
		System.out.print("저자 입력>>");
		bk1.setAuthor(sc.next());
		System.out.print("년도 입력>>");
		bk1.year=sc.nextInt(); //public 사용해서 year사용 가능
		
		
		System.out.println("제목 : "+bk1.getTitle()+"\n저자 : "+bk1.getAuthor()+"\n연도 : "+bk1.year);
	}

}
