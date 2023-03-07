import java.util.Scanner;

public class fotstar01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan = 2;
		while (dan < 10) {
			int num = 1;
			while (num < 10) {
				System.out.println(dan + "*" + num + "=" + dan * num);
				num++;
			}
			System.out.println();
			dan++;
		}
		/*
		 * int dan;
		 * int num=1;
		 * System.out.println("Ãâ·ÂÇÒ ´Ü ÀÔ·Â>>");
		 * dan = sc.nextInt();
		 * while (num < 10) {
		 * System.out.println(dan + "*" + num + "=" + dan * num);
		 * num++;
		 * 
		 * }
		 */

	}

	/*
	 * int i = 0; int sum=0,sum1=0; while(i<=10) { System.out.print(i+" ");
	 * System.out.println(); if(i%2==0) sum+=i; //Â¦¼öÀÇ ÇÕ else sum1+=i;//È¦¼öÀÇ ÇÕ i++; }
	 * System.out.println("Â¦¼öÇÕ = "+sum); System.out.println("È¦¼öÇÕ = "+sum1);
	 */
}
