import java.util.Scanner;

public class Pro369 {

	public static void main(String[] args) {
		int num = 0,count = 0; 
		int a,b,c;
		System.out.print("���ڸ� �Է��ϼ���"); //0~1000
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		if(num>=1&&num<=1000) {
			a=num%10;	// 1���ڸ� �˻�
			b=num/10;	// 10���ڸ� �˻�
			c=num/100;	// 100���ڸ� �˻�
			if(a!=1&&a%3==0) //1���ڸ� �˻� 3��� �̸� count++
				count++;
			if(b!=1&&b%3==0) //10���ڸ� �˻� 3��� �̸� count++
				count++;
			if(c!=1&&c%3==0)
				count++;
		}
		if(count==1)
			System.out.println("�ڼ� ¦");
		else if(count==2)
			System.out.println("�ڼ� ¦¦");
		else if(count==3)
			System.out.println("�ڼ� ¦¦¦");
		else
			System.out.println("������ ������ϴ�");

	}

}
