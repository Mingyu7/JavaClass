
public class Exception01 {

	public static void main(String[] args) {
		int a=1,b=2;
		
		try {
			System.out.println(a/b);
		}catch (ArithmeticException e) {
			System.out.println("0���� ������ �����");
		}finally {
			System.out.println("����");
		}
		
		
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i;
		}
		try {
		for(int i=0;i<=10;i++) {
			System.out.println(arr[i]);
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�ε������� �ʰ�");
		}catch(Exception e) {
			System.out.println("����");
		}
	}

}
