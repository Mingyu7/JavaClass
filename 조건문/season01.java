package object01;

import java.util.Scanner;

public class season01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int season;
		String season1 = "";
		System.out.println("���� �Է� �ϼ���>>");
		season = sc.nextInt();
		
		switch(season)
		{
		case 3:
		case 4:
		case 5:
		season1 = "��";
		break;
		case 6:
		case 7:
		case 8:
		season1 = "����";
		break;
		case 9:
		case 10:
		case 11:
		season1 = "����";
		break;
		case 12:
		case 1:
		case 2:
		season1 = "�ܿ�";
		break;
		
		default:
			System.out.println("���� �߸� �Է� �ϼ̽��ϴ�.");
			break;
		}
		System.out.println("�Է��Ͻ� "+season+"���� ������ "+season1+" �Դϴ�");
	}

}
