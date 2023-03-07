import java.util.Random;
import java.util.Scanner;

public class Random01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();

		int ranNum = 0;
		int inputNum = 0;
		int countNum = 0;

		ranNum = rm.nextInt(100);

		System.out.println("**0~100사이의 숫자 맞추기");

		do {
			System.out.print("숫자 입력>>");
			inputNum = sc.nextInt();

			if (inputNum > ranNum)
				System.out.println("입력한 숫자가 커요");
			else if (inputNum < ranNum)
				System.out.println("입력한 숫자가 작아요");

			countNum++;

		} while (inputNum != ranNum);
		System.out.println("빙고 " + countNum + "번 만에 맞추셨네요.");
	}

}
