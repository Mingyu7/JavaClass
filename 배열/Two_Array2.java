import java.util.Scanner;

public class Two_Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] number = { { 1, 2, 3, 4, 3, 1, 4, 2, 2, 1 }, { 3, 2, 4, 2, 2, 1, 1, 3, 4, 1 },
				{ 4, 3, 2, 2, 1, 2, 3, 2, 1, 4 }, { 2, 3, 1, 1, 3, 2, 1, 2, 2, 3 }, { 4, 3, 1, 1, 1, 1, 1, 2, 2, 3 } };

		int[] answer = new int[10];
		int score;
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է��ϼ��� : >>");

		for (int i=0;i<answer.length;i++) {
			answer[i] = sc.nextInt();
		} // i�� 10������(answer�迭�� ���̱���) ������Ű�鼭 ��ĳ�ʷ� �迭 answer[i]�� ����.

		for (int i = 0; i <= 4; i++) { // ����� 4�����ϱ�.
			score = 0;
			for (int j = 0; j < 10; j++) {
				if (number[i][j] == answer[j])
					score++; // number�� i�� ���4���� 1���̰� j�� 10�������� == answer[j](��ĳ�ʰ� �Է��� 10���� ��)�� ������ score�� 1����
								// ����.
			}

			System.out.println("�л� " + (i + 1) + ":" + score+"��");
		}
	}

}
