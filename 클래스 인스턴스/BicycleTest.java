
public class BicycleTest {

	public static void main(String[] args) {
		Bicycle b1 = new Bicycle();
		b1.name="따릉이";
		b1.weigth=19;
		b1.price=50000;
		
		System.out.println("이름: "+ b1.name);
		System.out.println("중량: "+b1.weigth);
		System.out.println("가격: "+b1.price);
		
		b1.move();
		b1.horn();

	}

}
