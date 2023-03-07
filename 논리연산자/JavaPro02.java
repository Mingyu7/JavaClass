
public class JavaPro02 {

	public static void main(String[] args) {
		
		int x=1,y=1;
		int nextX, nextY;
		nextX = ++x;
		nextY = y++;
					
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println("nextX = "+nextX);
		System.out.println("nextY = "+nextY);
		
		int age = 23;
		int b = 25,c=21;
		System.out.println(age<=12);
		System.out.println((age<25) && (age>c));
		System.out.println((age-5) == 18);
		
	}
}
