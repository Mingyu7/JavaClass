
import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Book bk1 = new Book();
		System.out.print("���� �Է�>>");
		bk1.setTitle(sc.next());
		System.out.print("���� �Է�>>");
		bk1.setAuthor(sc.next());
		System.out.print("�⵵ �Է�>>");
		bk1.year=sc.nextInt(); //public ����ؼ� year��� ����
		
		
		System.out.println("���� : "+bk1.getTitle()+"\n���� : "+bk1.getAuthor()+"\n���� : "+bk1.year);
	}

}
