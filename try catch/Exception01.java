
public class Exception01 {

	public static void main(String[] args) {
		int a=1,b=2;
		
		try {
			System.out.println(a/b);
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없어요");
		}finally {
			System.out.println("종료");
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
			System.out.println("인덱스범위 초과");
		}catch(Exception e) {
			System.out.println("오류");
		}
	}

}
