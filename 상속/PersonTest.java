import java.util.Scanner;

public class PersonTest {
	public static void printType(Person p) {
		if(p instanceof Student)
			System.out.println("학생입니다.");
		else if(p instanceof Researcher) {
			if(p instanceof Professor) {
				System.out.println("교수입니다");
			}else {
			System.out.println("연구원입니다");
			}
		}
	}

	public static void main(String[] args) {
		
		Person [] p = new Person[3];
		p[0] = new Student("김유원",23,"990111","22026030","스마트IT"); //업캐스팅
		p[1] = new Researcher("이미영", 25, "970521", "빅데이터");
		p[2]=new Professor("김철수",45,"780928", "멀티미디어","전임교수");
		
		for(int i=0;i<p.length;i++) {
			p[i].print();
			PersonTest.printType(p[i]);
			if(p[i] instanceof Student) {
				((Student)p[i]).study();
				System.out.println();
			}
			System.out.println();
		}
		
		/*
		System.out.println(p[0].getName());
		System.out.println(p[0].getAge());
		System.out.println(p[0].getSsn());
		System.out.println(((Student) p[0]).getSnum()); //다운캐스팅
		System.out.println(((Student) p[0]).getSdept());
		
		/*
		Student s =(Student)p[0];
		System.out.println(s.getSnum());
		System.out.println(s.getSdept());
		*/
		
		/*Scanner sc = new Scanner(System.in);

		Student[] stu = new Student[3];
		System.out.println("학생수 : " + stu.length + "명");

		System.out.println();
		String name, ssn, snum, sdept;
		int age;
		for (int i = 0; i < stu.length; i++) {
			System.out.print("이름>>");
			name = sc.next();
			System.out.print("나이>>");
			age = sc.nextInt();
			System.out.print("주민번호>>");
			ssn = sc.next();
			System.out.print("학번>>");
			snum = sc.next();
			System.out.print("학과>>");
			sdept = sc.next();
			
			stu[i]= new Student(name, age, ssn, snum, sdept);
			System.out.println("학생 객체가 생성되었습니다");
		}
		for(int i=0;i<stu.length;i++) {
			stu[i].print();
			System.out.println();
			/*
			System.out.println("이름: "+stu[i].getName());
			System.out.println("나이: "+stu[i].getAge());
			System.out.println("주번: "+stu[i].getSsn());
			System.out.println("학번: "+stu[i].getSnum());
			System.out.println("학과: "+stu[i].getSdept());
			System.out.println();
			
		}*/
	}

}
