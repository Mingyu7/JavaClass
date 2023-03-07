import java.util.Scanner;

public class PizzaTest {

	public static void main(String[] args) {
		Pizza[] pz =new Pizza[3];
		Scanner sc = new Scanner(System.in);
		
		String topping;
		int radius;
		System.out.println("*** 피자 3개 만들기 ***");
		
		for(int i=0;i<pz.length;i++) {
			
			System.out.print("피자 반지름>>");
			radius=sc.nextInt();
			System.out.print("피자 토핑>>");
			topping=sc.next();
			
			pz[i]= new Pizza(radius,topping);
			System.out.println();
		}
		for(int j=0;j<pz.length;j++) {
			pz[j].print();
		}
	}

}
