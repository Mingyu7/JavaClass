import java.util.Scanner;

public class TodoTest {

	public static void main(String[] args) {
		Todo[] td = new Todo[30];

		Scanner sc = new Scanner(System.in);

		int num, day;
		String work, time;
		while (true) {
			System.out.print("����(�Է�:1, ����:2, ������:3)>>");
			num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.print("��¥(1~30)>>");
				day = sc.nextInt();
				if (day > 30)
					System.out.println("�߸� �Է��߽��ϴ�.");
				System.out.print("�����Է�>>");
				work = sc.next();
				System.out.print("�ð��Է�>>");								
				time = sc.next();
				if (time == "")
					System.out.println("�ð��� �����ϴ�.");
				td[day] = new Todo(work, time);
				continue;
			case 2:
				System.out.print("��¥(1~30)>>");
				day = sc.nextInt();
				td[day].show();
				continue;
			case 3:
				System.out.println("�ý����� �����մϴ�.");
				break;
			default:
				System.out.println("�߸� �Է��߽��ϴ�.");
				continue;
			}
			break;
		}
	}

}
