import java.util.Scanner;

public class MonthDay {

	public static void main(String[] args) {
		int month = 0, days = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���>>");

		month = sc.nextInt();

		switch (month) {
		case 2:
			days = 28;
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;

		default:
			days = 31;
			break;
		}
		System.out.println(month+"���� "+days+"�Դϴ�. ");
	}

}
