import java.util.ArrayList;
import java.util.Scanner;

public class EmpTest {

	

	public static void main(String[] args) {
		ArrayList<Employee> Emp = new ArrayList<>();
		int sw;
		String name, dept, tel, salary;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("******** ������� �ý��� ********");
		while (true) {
			System.out.println("1.�Է�  2.����  3.�˻�  4.���  5.���� >>");
			sw = sc.nextInt();
			if (sw == 1) {
				System.out.print("�̸��Է�>>");
				name = sc.next();
				System.out.print("�μ��Է�>>");
				dept = sc.next();
				System.out.print("��ȭ�Է�>>");
				tel = sc.next();
				System.out.print("�޿��Է�>>");
				salary = sc.next();
				Employee e = new Employee(name, dept, tel, salary);
				Emp.add(e);

			}
			if (sw == 2) {
				for (int i = 0; i < Emp.size(); i++) {
					System.out.print("������ �̸�>>");
					name = sc.nextLine();
					if (name.equals(Emp.get(i).getName())) {
						System.out.println(name+" �̸������� �����մϴ�");
						Emp.remove(i);
						break;
					}
				}
			}
			if (sw == 3) {
				for (int i = 0; i < Emp.size(); i++) {
					System.out.print("�˻��� �̸�>>");
					name = sc.nextLine();
					if (name.equals(Emp.get(i).getName())) {
						System.out.println("�̸�:"+Emp.get(i).getName());
						System.out.println("�μ�:"+Emp.get(i).getDept());
						System.out.println("��ȭ:"+Emp.get(i).getTel());
						System.out.println("�޿�:"+Emp.get(i).getSalary());
						break;
					}
				}
			}
			if (sw == 4) {
				for (int i = 0; i < Emp.size(); i++) {					
					System.out.println("�̸�:"+Emp.get(i).getName());
					System.out.println("�μ�:"+Emp.get(i).getDept());
					System.out.println("��ȭ:"+Emp.get(i).getTel());
					System.out.println("�޿�:"+Emp.get(i).getSalary());
					System.out.println("----------------------------");
				}
			}
			if (sw == 5) break;
		}

	}

}
