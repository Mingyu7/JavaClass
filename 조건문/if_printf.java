import java.util.Scanner;

public class if_printf {

	public static void main(String[] args) {
		/*
		  int toeic = 750;
		  char score='B'; 
		  String result ="";
		  result=(toeic>=750 && score=='A')? * "Pass":"no Pass"; 
		  System.out.println(result);
		
		int num=0,a,b,c;
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("0~1000���� ���� �Է��ϼ���>>");
		num = sc.nextInt();
		
		if(num>=1&&num<=1000) {
			a=num%10;
			b=num/10;
			c=num/100;
			if(a%3==0) count++;
			if(b%3==0) count++;
			if(c%3==0) count++;
		}
		if(count==1) System.out.println("�ڼ� ¦");
		else if(count==2) System.out.println("�ڼ� ¦¦");
		else if(count==3) System.out.println("�ڼ� ¦¦¦");
		else System.out.print("���� ������ϴ�.");
		
		//�⵵ �Է��ϸ� ���� ���
		int num,age=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("����⵵�� �Է��ϼ���");
		num = sc.nextInt();
		
		age = 2022-num;
		
		
		System.out.println("���̴�"+age+"�Դϴ�");
		
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("����⵵�� �Է��ϼ���>>");
		num = sc.nextInt();
		
		int[] s=new int[10];
		
		for(int i=0;i<s.length;i++) {
			s[i]=i;
		}
		
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]+" ");
		}
		
		int[] scores = new int[3];
		int total=0;
		double avg=0.0;
		Scanner sc = new Scanner(System.in);
				
		for(int i =0;i<scores.length;i++) {
			System.out.println("������ �Է��ϼ���>>");
			scores[i] = sc.nextInt();
			
		}
		System.out.println(scores[1]);
		for(int i=0;i<scores.length;i++) {
			total+=scores[i];
			avg=total/scores.length;
		}
		
		System.out.println("��� ���� >> "+avg);
		
		int a=0;
		double a1=3.1515;
		float a2=3.1362313f;
		float a3=3.123923f;
		
		System.out.printf("�Ҽ� ù° �ڸ����� ǥ��>>"+"%.1f",a1);
		System.out.println();
		System.out.printf("�Ҽ� ��° �ڸ����� ǥ��>>"+"%.2f",a2);
		System.out.println();
		System.out.printf("�Ҽ� ��° �ڸ����� ǥ��>>"+"%.3f",a3);
		
		
		int [] arr1 = {0,1,2,3,4};
		int []arr2 = new int[arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=arr1[i];
			
		}
		System.out.println(arr2[1]);
		
		int sum=0;
		int []arr1 = {12,15,14,11,20};
		int []arr2 = Arrays.copyOf(arr1,arr1.length);//�����迭 , ������ ����
		int []arr3 = Arrays.copyOfRange(arr1,0,5); //���� �迭 , ������ �����ε��� , ������ ���ε���
		
		Arrays.sort(arr1); //������������ ����
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println(arr3[3]);
		
		for(int i:arr1) {
			sum+=i;
		}
		System.out.println(sum);
		*/
		
		int a=1;
		for(int i=10;i<a*2+i;i--) {
			for(int j=10;j>i;j+=2)
				System.out.println(j+i+a);
		}
			
		
		

	}
}
