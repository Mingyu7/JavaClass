import java.util.Scanner;

public class Pro369 {

	public static void main(String[] args) {
		int num = 0,count = 0; 
		int a,b,c;
		System.out.print("숫자를 입력하세요"); //0~1000
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		if(num>=1&&num<=1000) {
			a=num%10;	// 1의자리 검사
			b=num/10;	// 10의자리 검사
			c=num/100;	// 100의자리 검사
			if(a!=1&&a%3==0) //1의자리 검사 3배수 이면 count++
				count++;
			if(b!=1&&b%3==0) //10의자리 검사 3배수 이면 count++
				count++;
			if(c!=1&&c%3==0)
				count++;
		}
		if(count==1)
			System.out.println("박수 짝");
		else if(count==2)
			System.out.println("박수 짝짝");
		else if(count==3)
			System.out.println("박수 짝짝짝");
		else
			System.out.println("범위를 벗어났습니다");

	}

}
