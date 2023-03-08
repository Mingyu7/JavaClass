import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int num =0, sum=0;
		for(int i =0;i<3;i++) {
			System.out.print("숫자입력>>");
			try {
				num=sc.nextInt();				
			}catch (Exception e) {
				System.out.println("숫자 입력 오류");
				i--;
				sc.next();
				continue;				
			}
			sum+=num;					
		}
		System.out.println("합:"+sum);

	}

}
