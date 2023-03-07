
public class Calculator {
	public static int add(int a, int b) {
		return a + b;
	}

	public static int sub(int a, int b) {
		return a - b;
	}

	public static int mul(int a, int b) {
		return a * b;
	}

	public static int div(int a, int b) {
		return a / b;
	}

	public static int abs(int a) {
		return a > 0 ? a : -a;
	}

	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	public static int min(int a, int b) {
		return (a > b) ? b : a;
	}

}
