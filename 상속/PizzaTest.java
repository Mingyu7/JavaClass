import java.util.Scanner;

public class PizzaTest {

	public static void main(String[] args) {
		Pizza[] pz =new Pizza[3];
		Scanner sc = new Scanner(System.in);
		
		String topping;
		int radius;
		System.out.println("*** ���� 3�� ����� ***");
		
		for(int i=0;i<pz.length;i++) {
			
			System.out.print("���� ������>>");
			radius=sc.nextInt();
			System.out.print("���� ����>>");
			topping=sc.next();
			
			pz[i]= new Pizza(radius,topping);
			System.out.println();
		}
		for(int j=0;j<pz.length;j++) {
			pz[j].print();
		}
	}

}
