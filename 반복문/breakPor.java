import java.util.Scanner;

public class breakPor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;
		int count = 0;
		int sum = 0;

		while (true) {
			System.out.println("������ �Է��ϼ���>>");
			num = sc.nextInt();
			if (num < 0) {
				break;
			}
			sum+=num;
			count++;
		}
		System.out.println("Ƚ�� :"+count+", ��� : "+(sum/count));

	}

}
