import java.util.Random;
import java.util.Scanner;

public class Random01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();

		int ranNum = 0;
		int inputNum = 0;
		int countNum = 0;

		ranNum = rm.nextInt(100);

		System.out.println("**0~100������ ���� ���߱�");

		do {
			System.out.print("���� �Է�>>");
			inputNum = sc.nextInt();

			if (inputNum > ranNum)
				System.out.println("�Է��� ���ڰ� Ŀ��");
			else if (inputNum < ranNum)
				System.out.println("�Է��� ���ڰ� �۾ƿ�");

			countNum++;

		} while (inputNum != ranNum);
		System.out.println("���� " + countNum + "�� ���� ���߼̳׿�.");
	}

}
