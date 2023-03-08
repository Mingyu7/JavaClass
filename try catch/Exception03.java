import java.util.Scanner;

public class Exception03 {
	public static int changeNum() throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자형 문자 입력>>");
		String snum = sc.next();
		int num = Integer.parseInt(snum);
		return num;
	}
	public static void main(String[] args) {
		try {
			System.out.println(changeNum());
		}catch( NumberFormatException e) {
			System.out.println("숫자 변환 오류");
		}catch(Exception e) {
			System.out.println("기타오류");
		}finally {
			System.out.println("종료");
		}
	}

}
