import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int num =0, sum=0;
		for(int i =0;i<3;i++) {
			System.out.print("�����Է�>>");
			try {
				num=sc.nextInt();				
			}catch (Exception e) {
				System.out.println("���� �Է� ����");
				i--;
				sc.next();
				continue;				
			}
			sum+=num;					
		}
		System.out.println("��:"+sum);

	}

}
