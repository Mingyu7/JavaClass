
public class BicycleTest {

	public static void main(String[] args) {
		Bicycle b1 = new Bicycle();
		b1.name="������";
		b1.weigth=19;
		b1.price=50000;
		
		System.out.println("�̸�: "+ b1.name);
		System.out.println("�߷�: "+b1.weigth);
		System.out.println("����: "+b1.price);
		
		b1.move();
		b1.horn();

	}

}
