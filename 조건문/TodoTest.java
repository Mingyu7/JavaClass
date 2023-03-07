import java.util.Scanner;

public class TodoTest {

	public static void main(String[] args) {
		Todo[] td = new Todo[30];

		Scanner sc = new Scanner(System.in);

		int num, day;
		String work, time;
		while (true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3)>>");
			num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.print("날짜(1~30)>>");
				day = sc.nextInt();
				if (day > 30)
					System.out.println("잘못 입력했습니다.");
				System.out.print("할일입력>>");
				work = sc.next();
				System.out.print("시간입력>>");								
				time = sc.next();
				if (time == "")
					System.out.println("시간이 없습니다.");
				td[day] = new Todo(work, time);
				continue;
			case 2:
				System.out.print("날짜(1~30)>>");
				day = sc.nextInt();
				td[day].show();
				continue;
			case 3:
				System.out.println("시스템을 종료합니다.");
				break;
			default:
				System.out.println("잘못 입력했습니다.");
				continue;
			}
			break;
		}
	}

}
