
public class samestring {

	public static void main(String[] args) {
		String a = new String(" U1 SmartIT");
		String b = new String(" U1 SmartIT");
		String c = a;
		if (a == b) // false ==동등연산자는 같은 것만 구분
			System.out.println("a==b ");
		if (a == c) // true a의 값이 c에 똑같이 들어갔기때문에 동일
			System.out.println("a c 동일");
		if (a.equals(b)) // 객체 안에 문자열이 같다
			System.out.println("a 와 b 는 동일하다");

	}

}
