import java.util.Scanner;

public class Exception03 {
	public static int changeNum() throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���� �Է�>>");
		String snum = sc.next();
		int num = Integer.parseInt(snum);
		return num;
	}
	public static void main(String[] args) {
		try {
			System.out.println(changeNum());
		}catch( NumberFormatException e) {
			System.out.println("���� ��ȯ ����");
		}catch(Exception e) {
			System.out.println("��Ÿ����");
		}finally {
			System.out.println("����");
		}
	}

}
