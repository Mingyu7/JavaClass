import java.util.Scanner;

public class PersonTest {
	public static void printType(Person p) {
		if(p instanceof Student)
			System.out.println("�л��Դϴ�.");
		else if(p instanceof Researcher) {
			if(p instanceof Professor) {
				System.out.println("�����Դϴ�");
			}else {
			System.out.println("�������Դϴ�");
			}
		}
	}

	public static void main(String[] args) {
		
		Person [] p = new Person[3];
		p[0] = new Student("������",23,"990111","22026030","����ƮIT"); //��ĳ����
		p[1] = new Researcher("�̹̿�", 25, "970521", "������");
		p[2]=new Professor("��ö��",45,"780928", "��Ƽ�̵��","���ӱ���");
		
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
		System.out.println(((Student) p[0]).getSnum()); //�ٿ�ĳ����
		System.out.println(((Student) p[0]).getSdept());
		
		/*
		Student s =(Student)p[0];
		System.out.println(s.getSnum());
		System.out.println(s.getSdept());
		*/
		
		/*Scanner sc = new Scanner(System.in);

		Student[] stu = new Student[3];
		System.out.println("�л��� : " + stu.length + "��");

		System.out.println();
		String name, ssn, snum, sdept;
		int age;
		for (int i = 0; i < stu.length; i++) {
			System.out.print("�̸�>>");
			name = sc.next();
			System.out.print("����>>");
			age = sc.nextInt();
			System.out.print("�ֹι�ȣ>>");
			ssn = sc.next();
			System.out.print("�й�>>");
			snum = sc.next();
			System.out.print("�а�>>");
			sdept = sc.next();
			
			stu[i]= new Student(name, age, ssn, snum, sdept);
			System.out.println("�л� ��ü�� �����Ǿ����ϴ�");
		}
		for(int i=0;i<stu.length;i++) {
			stu[i].print();
			System.out.println();
			/*
			System.out.println("�̸�: "+stu[i].getName());
			System.out.println("����: "+stu[i].getAge());
			System.out.println("�ֹ�: "+stu[i].getSsn());
			System.out.println("�й�: "+stu[i].getSnum());
			System.out.println("�а�: "+stu[i].getSdept());
			System.out.println();
			
		}*/
	}

}
