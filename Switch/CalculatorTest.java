import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		int menu, result;
		System.out.println("두 수를 입력하세요>>");
		a = sc.nextInt();
		b = sc.nextInt();

		while (true) {
			System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.절대값 6.최대값 7.최소값 8.종료");
			menu = sc.nextInt();
			if (menu == 8)
				break;
			result = 0;
			switch (menu) {
			case 1:
				result = Calculator.add(a, b);
				break;
			case 2:
				result = Calculator.sub(a, b);
				break;
			case 3:
				result = Calculator.mul(a, b);
				break;
			case 4:
				result = Calculator.div(a, b);
				break;
			case 5:
				result = Calculator.abs(a);
				break;
			case 6:
				result = Calculator.max(a, b);
				break;
			case 7:
				result = Calculator.min(a, b);
				break;

			}
			System.out.println("연산 결과: "+result);
		}

	}

}
