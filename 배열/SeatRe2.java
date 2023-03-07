import java.util.Scanner;

public class SeatRe2 {

	public static void main(String[] args) {
		int[][] seats = new int[10][10];
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++)
				seats[i][j] = 0;
		}
		int inputColumn, inputRow;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("************************************************");
			for (int i = 0; i < seats.length; i++) {
				System.out.print("[" + (i + 1) + "] ");
			}

			System.out.println("[����ȣ]");
			System.out.println("************************************************");

			for (int i = 0; i < seats.length; i++) {
				for (int j = 0; j < seats[i].length; j++) {
					System.out.print(" " + seats[i][j] + "  ");
				}
				System.out.println(" [" + (i + 1) + " ��]");
			}
			System.out.println("************************************************");

			System.out.print("�¼��� �� ����>>");
			inputColumn = sc.nextInt();
			if (inputColumn == -1)
				break;

			System.out.print("�¼��� �� ����>>");
			inputRow = sc.nextInt();
			if (inputRow == -1)
				break;

			if (seats[inputRow - 1][inputColumn - 1] == 0) {
				seats[inputRow - 1][inputColumn - 1] = 1;
				System.out.println("����Ǿ����ϴ�");
			} else {
				System.out.println("�̹� ����� �ڸ��Դϴ�");
			}

		}

	}

}
