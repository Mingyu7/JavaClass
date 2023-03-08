import java.util.Scanner;

public class BookTest {
	public static void printType(Book b) {
		if (b instanceof Novel) //�ν��Ͻ� ����ؼ� ��ĳ���� Ȯ��
			System.out.println("�帣: �Ҽ�");
		if (b instanceof Poet)
			System.out.println("�帣: ��");
		if (b instanceof ScienceFiction)
			System.out.println("�帣: SF");
	}

	public static void main(String[] args) {
		int num = 0;
		int ISDN = 0;
		String title = "";
		String author = "";

		Scanner sc = new Scanner(System.in);
		Book[] Bk = new Book[3];

		System.out.println("** ���� �Է� **");

		for (int i = 0; i < Bk.length; i++) {

			System.out.print("1.�Ҽ� 2.SF 3.��>>");
			num = sc.nextInt();
			switch (num) {
			case 1:
				Bk[i] = new Novel(ISDN, title, author);
				System.out.print("ISDN>>");
				ISDN = sc.nextInt();
				Bk[i].setISDN(ISDN);
				System.out.print("����>>");
				title = sc.next();
				Bk[i].setTitle(title);
				System.out.print("����>>");
				author = sc.next();
				Bk[i].setAuthor(author);
				break;
				
			case 2:
				Bk[i] = new ScienceFiction(ISDN, title, author);
				System.out.print("ISDN>>");
				ISDN = sc.nextInt();
				Bk[i].setISDN(ISDN);
				System.out.print("����>>");
				title = sc.next();
				Bk[i].setTitle(title);
				System.out.print("����>>");
				author = sc.next();
				Bk[i].setAuthor(author);
				break;
			case 3:
				Bk[i] = new Poet(ISDN, title, author);
				System.out.print("ISDN>>");
				ISDN = sc.nextInt();
				Bk[i].setISDN(ISDN);
				System.out.print("����>>");
				title = sc.next();
				Bk[i].setTitle(title);
				System.out.print("����>>");
				author = sc.next();
				Bk[i].setAuthor(author);
				break;
			}

		}

		System.out.println("** ���� ���� ��� **");
		for (int i = 0; i < Bk.length; i++) {
			BookTest.printType(Bk[i]);
			System.out.println("ISDN: " + Bk[i].getISDN());
			System.out.println("����: " + Bk[i].getTitle());
			System.out.println("����: " + Bk[i].getAuthor());
			System.out.println(Bk[i].getLateFee(1));
			System.out.println();

		}

	}

}
