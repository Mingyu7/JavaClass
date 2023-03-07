public class BoilerTest {

	public static void main(String[] args) {
		Boiler bl = new Boiler();

		System.out.println("현재 온도: " + bl.setTemp());
		System.out.println("1도 올리기>>현재온도:" + bl.tempUp());
		System.out.println("25도 올리기>>현재온도:" + bl.tempUp(25));
		System.out.println("25도 올리기>>현재온도:" + bl.tempUp(25));

	}

}
