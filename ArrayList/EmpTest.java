import java.util.ArrayList;
import java.util.Scanner;

public class EmpTest {

	

	public static void main(String[] args) {
		ArrayList<Employee> Emp = new ArrayList<>();
		int sw;
		String name, dept, tel, salary;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("******** 사원관리 시스템 ********");
		while (true) {
			System.out.println("1.입력  2.삭제  3.검색  4.출력  5.종료 >>");
			sw = sc.nextInt();
			if (sw == 1) {
				System.out.print("이름입력>>");
				name = sc.next();
				System.out.print("부서입력>>");
				dept = sc.next();
				System.out.print("전화입력>>");
				tel = sc.next();
				System.out.print("급여입력>>");
				salary = sc.next();
				Employee e = new Employee(name, dept, tel, salary);
				Emp.add(e);

			}
			if (sw == 2) {
				for (int i = 0; i < Emp.size(); i++) {
					System.out.print("삭제할 이름>>");
					name = sc.nextLine();
					if (name.equals(Emp.get(i).getName())) {
						System.out.println(name+" 이름정보를 삭제합니다");
						Emp.remove(i);
						break;
					}
				}
			}
			if (sw == 3) {
				for (int i = 0; i < Emp.size(); i++) {
					System.out.print("검색할 이름>>");
					name = sc.nextLine();
					if (name.equals(Emp.get(i).getName())) {
						System.out.println("이름:"+Emp.get(i).getName());
						System.out.println("부서:"+Emp.get(i).getDept());
						System.out.println("전화:"+Emp.get(i).getTel());
						System.out.println("급여:"+Emp.get(i).getSalary());
						break;
					}
				}
			}
			if (sw == 4) {
				for (int i = 0; i < Emp.size(); i++) {					
					System.out.println("이름:"+Emp.get(i).getName());
					System.out.println("부서:"+Emp.get(i).getDept());
					System.out.println("전화:"+Emp.get(i).getTel());
					System.out.println("급여:"+Emp.get(i).getSalary());
					System.out.println("----------------------------");
				}
			}
			if (sw == 5) break;
		}

	}

}
