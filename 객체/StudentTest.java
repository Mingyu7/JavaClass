import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		double ave = 0;
		
		System.out.print("�л��� �Է�>>");
		int i = sc.nextInt();
		Student Stu[] = new Student[i];
		int g, s, e;
		for (int j = 0; j < Stu.length; j++) {
			System.out.println("**" + (j + 1) + "�� �л� �Է�**");
			System.out.print("�й�>>");
			int StudentNo = sc.nextInt();

			System.out.print("�̸�>>");
			String name = sc.next();

			System.out.print("����(���� ���� ����))>>");
			

			System.out.println();
			Stu[j] = new Student(name, StudentNo,score);
		}
		System.out.println("**�й�\t�̸�\t����\t���**");
		for (int k = 0; k < Stu.length; k++) {
			System.out.printf(
					Stu[k].getStudentNo() + "\t" + Stu[k].getName() + "\t" + Stu[k].getTotal() + "\t" + "%.2f",
					Stu[k].getAvg());
			System.out.println();
		}

		// System.out.printf("��ü ����:"+sum+", "+"��ü ���:"+"%.2d",avg);
	}

}
