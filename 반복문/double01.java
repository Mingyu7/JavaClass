package object01;

public class double01 {

	public static void main(String[] args) {
		int count = 0;
		for (int a = 0; a < 10; a++) { //a = 9���� ���� 10�� �ݺ�
			for (int i = 0; i < 5; i++) { // i = 4���� ���� 5�� �ݺ�
				System.out.println("*"); //���ٴ� ���ϳ� ���
				System.out.println(" *"); //�����ٿ� ����� �� ���
				count++;				 // 5*10 = 50�� �ݺ�	
			}
		}

		System.out.println(count); //count = 50
	}

}
