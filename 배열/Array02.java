import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		int[] s = { 2, 5, 6, 7, 8, 9, 17, 16, 18, 22 };
		int value;
		int index = -1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Ž����>>");
		value = sc.nextInt();

		for (int i = 0; i < s.length; i++) {
			if (value == s[i]) {
				index=i;
				break;
			}

		}
		if (index != -1) {
			System.out.println("����~ " + index + " ��°�� �ֳ׿�.");
		} else {
			System.out.println("��ã�Ҿ��");
		}

	}

}
