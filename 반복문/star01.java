
public class star01 {

	public static void main(String[] args) {
		// ���ﰢ��
		int num = 5;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i; j++)
				System.out.print("*");
			if(i!=0)
			System.out.println();
		}
		System.out.println();
		//�ﰢ��
		for (int i = 1; i < 6; i++) {
			for (int j = 5; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		System.out.println();
		// ���ﰢ��
		for (int a = 5; a > 0; a--) {
			for (int b = 0; b < a; b++)
				System.out.print("*");
			System.out.println();
		}
		// �Ƕ�̵� ���
		for (int i = 0; i < num; i++) { 
			for (int j = num -1; j > i; j--) {
				System.out.print(" ");
			}
			for (int j =0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		// �� �Ƕ�̵� ���
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			for (int j = 2 * num - 1; j > 2 * i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
