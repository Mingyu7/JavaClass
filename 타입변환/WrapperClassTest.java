
public class WrapperClassTest {

	public static void main(String[] args) {
		
		int i=10;
		double d=3.14;
		
		Integer ig=Integer.valueOf(i);
		Double de=Double.valueOf(d);
		
		System.out.println(ig);
		System.out.println(de);
		System.out.println("---�⺻Ÿ������ �ǵ�����---");
		System.out.println(ig.intValue());
		System.out.println(de.doubleValue());
		
		
		int is=Integer.parseInt("123");
		double df=Double.parseDouble("123.0");
		
		System.out.println(is);
		System.out.println(df);
		
		System.out.println("---type ��ȯ---");
		String s1 = Integer.toString(is);
		String s2 = Double.toString(df);
		
		System.out.println(s1);
		System.out.println(s2);
		

		
		int n=10;
		Integer intObj=n;
		System.out.println(intObj); 
		System.out.println(intObj+10); //�ڵ� ��ڽ� ������ 10�� ��������
		

	}

}
