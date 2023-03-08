import java.util.Scanner;

public class PencilTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		SharpPencil[] s = new SharpPencil[4];
		SharpPencil[] s1 = new SharpPencil[4];

		String name;
		int amount;
		double width;
		s[0] = new SharpPencil("스테들러", 10, 0.5);
		s[1] = new SharpPencil("워터맨", 8, 0.3);
		s[2] = new SharpPencil("라미", 10, 0.7);
		s[3] = new SharpPencil("몽블랑", 10, 0.5);

		System.out.println("번호\t이름\t용량\t굵기");

		for (int i = 0; i < s.length; i++) {

			System.out.println((i + 1) + "\t" + s[i].getName() + "\t" + s[i].getAmount() + "\t" + s[i].getWidth());

		}

		for (int i = 0; i < 2; i++) {
			System.out.println("검색 펜슬의 이름, 용량, 굵기 입력>>");
			name = sc.next();
			amount = sc.nextInt();
			width = sc.nextDouble();

			s1[i] = new SharpPencil(name, amount, width);

			if (((Pencil)s1[i]).equals(name) &&((Pencil)s1[i]).equals(amount) && ((Pencil)s1[i]).equals(width)) {
				System.out.println("동일한 펜슬이 존재합니다.");
			} else
				System.out.println("동일한 펜슬이 없습니다.");
		}
	}

}
