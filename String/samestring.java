
public class samestring {

	public static void main(String[] args) {
		String a = new String(" U1 SmartIT");
		String b = new String(" U1 SmartIT");
		String c = a;
		if (a == b) // false ==������ڴ� ���� �͸� ����
			System.out.println("a==b ");
		if (a == c) // true a�� ���� c�� �Ȱ��� ���⶧���� ����
			System.out.println("a c ����");
		if (a.equals(b)) // ��ü �ȿ� ���ڿ��� ����
			System.out.println("a �� b �� �����ϴ�");

	}

}
