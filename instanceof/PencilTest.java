import java.util.Scanner;

public class PencilTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		SharpPencil[] s = new SharpPencil[4];
		SharpPencil[] s1 = new SharpPencil[4];

		String name;
		int amount;
		double width;
		s[0] = new SharpPencil("���׵鷯", 10, 0.5);
		s[1] = new SharpPencil("���͸�", 8, 0.3);
		s[2] = new SharpPencil("���", 10, 0.7);
		s[3] = new SharpPencil("�����", 10, 0.5);

		System.out.println("��ȣ\t�̸�\t�뷮\t����");

		for (int i = 0; i < s.length; i++) {

			System.out.println((i + 1) + "\t" + s[i].getName() + "\t" + s[i].getAmount() + "\t" + s[i].getWidth());

		}

		for (int i = 0; i < 2; i++) {
			System.out.println("�˻� �潽�� �̸�, �뷮, ���� �Է�>>");
			name = sc.next();
			amount = sc.nextInt();
			width = sc.nextDouble();

			s1[i] = new SharpPencil(name, amount, width);

			if (((Pencil)s1[i]).equals(name) &&((Pencil)s1[i]).equals(amount) && ((Pencil)s1[i]).equals(width)) {
				System.out.println("������ �潽�� �����մϴ�.");
			} else
				System.out.println("������ �潽�� �����ϴ�.");
		}
	}

}
