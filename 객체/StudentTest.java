import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		double ave = 0;
		
		System.out.print("학생수 입력>>");
		int i = sc.nextInt();
		Student Stu[] = new Student[i];
		int g, s, e;
		for (int j = 0; j < Stu.length; j++) {
			System.out.println("**" + (j + 1) + "번 학생 입력**");
			System.out.print("학번>>");
			int StudentNo = sc.nextInt();

			System.out.print("이름>>");
			String name = sc.next();

			System.out.print("점수(국어 수학 영어))>>");
			

			System.out.println();
			Stu[j] = new Student(name, StudentNo,score);
		}
		System.out.println("**학번\t이름\t총점\t평균**");
		for (int k = 0; k < Stu.length; k++) {
			System.out.printf(
					Stu[k].getStudentNo() + "\t" + Stu[k].getName() + "\t" + Stu[k].getTotal() + "\t" + "%.2f",
					Stu[k].getAvg());
			System.out.println();
		}

		// System.out.printf("전체 총점:"+sum+", "+"전체 평균:"+"%.2d",avg);
	}

}
