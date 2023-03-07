package object01;

public class while01 {

	public static void main(String[] args) {
		int i = 0, count = 0;
		while (true) {
			i++; //1
			i += i; //2
			--count;
			System.out.println(count);
			break;
		}
		++count;
		if (i < 100) {
			System.out.println("¾È³ç");
		}
		System.out.println(i);
		System.out.println(count);
	}

}
