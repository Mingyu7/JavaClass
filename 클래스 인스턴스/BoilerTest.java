public class BoilerTest {

	public static void main(String[] args) {
		Boiler bl = new Boiler();

		System.out.println("���� �µ�: " + bl.setTemp());
		System.out.println("1�� �ø���>>����µ�:" + bl.tempUp());
		System.out.println("25�� �ø���>>����µ�:" + bl.tempUp(25));
		System.out.println("25�� �ø���>>����µ�:" + bl.tempUp(25));

	}

}
