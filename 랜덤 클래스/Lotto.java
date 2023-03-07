import java.util.Random;

public class Lotto {
	private int[] lotto = new int[6];
	Random ran = new Random();
	private static int count=0;
	
	public static int getCount() {
		return count;
	}

	Lotto() {
		
		for(int i=0;i<6;i++) {
		lotto[i] = ran.nextInt((45)+1);
		}
		count++;
	}

	Lotto(int a, int b, int c) {
		lotto[0] = a;
		lotto[1] = b;
		lotto[2] = c;
		for (int i = 3; i < lotto.length; i++) {
			lotto[i] = ran.nextInt((45)+1);
		}
		count++;
	}
	Lotto(int lo1,int lo2,int lo3,int lo4,int lo5,int lo6){
		lotto[0]=lo1;
		lotto[1]=lo2;
		lotto[2]=lo3;
		lotto[3]=lo4;
		lotto[4]=lo5;
		lotto[5]=lo6;
		count++;
	}

	void printLotto() {
		System.out.print("로또 번호 확인: ");
		for (int i = 0; i < 6; i++) {			
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
	}

}
