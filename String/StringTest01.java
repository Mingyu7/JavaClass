
public class StringTest01 {

	public static void main(String[] args) {
		String a=new String("Hello"); 
		String b=new String("Hello");
		
		String c="Helloi"; 
		String d="Helloi";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println("a==b : "+(a==b)); //같은 객체?
		System.out.println("c==d : "+(c==d)); //같은 리터럴?
		System.out.println("a==c : "+(a==c));
		System.out.println("a.equals(b) : "+(a.equals(b)));
		System.out.println("a.equals(d) : "+(a.equals(d))); 
		System.out.println("a.equals(c) : "+(a.equals(c))); 
		System.out.println(c.equals(d));
		System.out.println(a.charAt(0)); //H 출력 첫번째 문자열
		System.out.println(a.charAt(a.length()-1)); //마지막 문자열 o
		System.out.println(a.replace('H','h'));
		System.out.println(a.substring(0,3));
		System.out.println();
		
		String[] st=b.split(" "); //Hello World Java 스페이스단위로 배열에 정리
		for(int i=0;i<st.length;i++) {
			System.out.println(st[i]);
		}
		

	}

}
