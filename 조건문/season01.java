package object01;

import java.util.Scanner;

public class season01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int season;
		String season1 = "";
		System.out.println("월을 입력 하세요>>");
		season = sc.nextInt();
		
		switch(season)
		{
		case 3:
		case 4:
		case 5:
		season1 = "봄";
		break;
		case 6:
		case 7:
		case 8:
		season1 = "여름";
		break;
		case 9:
		case 10:
		case 11:
		season1 = "가을";
		break;
		case 12:
		case 1:
		case 2:
		season1 = "겨울";
		break;
		
		default:
			System.out.println("월을 잘못 입력 하셨습니다.");
			break;
		}
		System.out.println("입력하신 "+season+"월에 계절은 "+season1+" 입니다");
	}

}
