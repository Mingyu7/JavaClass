import java.util.Scanner;

public class SeatRe {

	public static void main(String[] args) {
		int[] seats = new int[10];
		for (int i = 0; i < seats.length; i++) {
			seats[i] = 0;
		}
		int inputColumn;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("************************************************");
			for (int i = 0; i < seats.length; i++) {
				System.out.print("[" + (i + 1) + "] ");
			}

			System.out.println("[����ȣ]");
			System.out.println("************************************************");
			for (int i = 0; i < seats.length; i++) {
				System.out.print(" " + seats[i] + "  ");
			
			}
			System.out.println();                
			System.out.println("************************************************");
			System.out.print("���ϴ� �¼���ȣ�� �Է��ϼ���(���� -1)");
			inputColumn = sc.nextInt();

			if (inputColumn == -1)
				break;
			if (seats[inputColumn - 1] == 0) {
				seats[inputColumn - 1] = 1;
				System.out.println("����Ǿ����ϴ�");
			} else {
				System.out.println("�̹� ����� �ڸ��Դϴ�");
			}
		}

	}

}
