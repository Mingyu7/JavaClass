import java.util.Scanner;

public class For01 {

	public static void main(String[] args) {
		/*	
		  	int sum =0;
		for (int i = 0;i<=10 ;i++ ) {
			if (i > 10) {
			break;
			sum+=i;
			}
			System.out.println("0~10������ ��  "+sum);
			*/
						
			
		/*	int count = 0,sum=0;
			for(int i=0;i<=10;i++) {
				if(i%2==1) {
					sum+=i;
					count++;
				}
			}
			System.out.println("Ȧ���� ���� :"+count);
			System.out.println("Ȧ���� �� :"+sum);	
			*/
		/*Scanner sc = new Scanner(System.in);
		int dan = 0;
		
		
		System.out.print("�� �Է�>>");
		dan=sc.nextInt();
		
		for(int i=1;i<=9;i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
			}
			*/
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		 }
		
	}

}
