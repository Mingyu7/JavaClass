import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Student[] st =new Student[5];
		
		Scanner sc = new Scanner(System.in);
		String snum, sname, sdept;
		
		for(int i =0;i<st.length;i++) {
			System.out.print((i+1)+"��° �й� �̸� �а��� �Է�>>");
			snum=sc.next();
			sname=sc.next();
			sdept=sc.next();
			
			st[i]=new Student(snum, sname, sdept);
			System.out.println();
		}
		System.out.println("�й�\t�̸�\t�а�");
		for(int i=0;i<st.length;i++) {
			System.out.println(st[i].getSnum()+"\t"+st[i].getSname()+"\t"+st[i].getSdept());
		}
	}

}
