import java.util.Scanner;

public class countinue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("제외할 배수 입력 :");
		int num = sc.nextInt();

		for (int i = 0; i <= 10; i++) {
			if (i % num == 0)
				continue;
			System.out.println(i);
		}

	}

}
