import java.util.Scanner;

public class BookTest {
	public static void printType(Book b) {
		if (b instanceof Novel) //인스턴스 사용해서 업캐스팅 확인
			System.out.println("장르: 소설");
		if (b instanceof Poet)
			System.out.println("장르: 시");
		if (b instanceof ScienceFiction)
			System.out.println("장르: SF");
	}

	public static void main(String[] args) {
		int num = 0;
		int ISDN = 0;
		String title = "";
		String author = "";

		Scanner sc = new Scanner(System.in);
		Book[] Bk = new Book[3];

		System.out.println("** 도서 입력 **");

		for (int i = 0; i < Bk.length; i++) {

			System.out.print("1.소설 2.SF 3.시>>");
			num = sc.nextInt();
			switch (num) {
			case 1:
				Bk[i] = new Novel(ISDN, title, author);
				System.out.print("ISDN>>");
				ISDN = sc.nextInt();
				Bk[i].setISDN(ISDN);
				System.out.print("제목>>");
				title = sc.next();
				Bk[i].setTitle(title);
				System.out.print("저자>>");
				author = sc.next();
				Bk[i].setAuthor(author);
				break;
				
			case 2:
				Bk[i] = new ScienceFiction(ISDN, title, author);
				System.out.print("ISDN>>");
				ISDN = sc.nextInt();
				Bk[i].setISDN(ISDN);
				System.out.print("제목>>");
				title = sc.next();
				Bk[i].setTitle(title);
				System.out.print("저자>>");
				author = sc.next();
				Bk[i].setAuthor(author);
				break;
			case 3:
				Bk[i] = new Poet(ISDN, title, author);
				System.out.print("ISDN>>");
				ISDN = sc.nextInt();
				Bk[i].setISDN(ISDN);
				System.out.print("제목>>");
				title = sc.next();
				Bk[i].setTitle(title);
				System.out.print("저자>>");
				author = sc.next();
				Bk[i].setAuthor(author);
				break;
			}

		}

		System.out.println("** 도서 정보 출력 **");
		for (int i = 0; i < Bk.length; i++) {
			BookTest.printType(Bk[i]);
			System.out.println("ISDN: " + Bk[i].getISDN());
			System.out.println("제목: " + Bk[i].getTitle());
			System.out.println("저자: " + Bk[i].getAuthor());
			System.out.println(Bk[i].getLateFee(1));
			System.out.println();

		}

	}

}
