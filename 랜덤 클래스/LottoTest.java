
public class LottoTest {

	public static void main(String[] args) {
		Lotto lo = new Lotto();
		System.out.println("**"+lo.getCount()+"�� �ζ�**");
		lo.printLotto();
		Lotto lo2 = new Lotto(4,10,50);
		System.out.println("**"+lo2.getCount()+"�� �ζ�**");
		lo2.printLotto();
		Lotto lo3 = new Lotto(4,10,50,12,13,34);
		System.out.println("**"+lo3.getCount()+"�� �ζ�**");
		lo3.printLotto();
		

	}

}
