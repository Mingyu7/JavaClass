import java.util.Scanner;
import java.util.Vector;


public class StudentTest {

	public static void main(String[] args) {
		String str = ""; //���ڿ� ����
		String name = "";
		String dep = "";
		int num = 0;
		double avg = 0;

		Scanner sc = new Scanner(System.in);
		Vector<Student> vst = new Vector<>();

		System.out.println("�л� �̸�, �а�, �й�, ��������� �Է��ϼ���.");
		while (true) {		
			
			for (int i = 1;i <= 4; i++) {
				System.out.print(">>");
				str = sc.nextLine();
				
				// str���ڿ� "," ���� ���� ������ ����
				String[] Sarr = str.split(","); 
				name = Sarr[0];
				dep = Sarr[1];				
				num = Integer.parseInt(Sarr[2]);
				avg = Double.parseDouble(Sarr[3]);
				
				Student s = new Student(name, dep, num, avg); //��ü�� ���� ����
				vst.add(s); //���Ϳ� ��ü ����
			}

			for (int i = 0; i < vst.size(); i++) {
				System.out.println("--------------------------");
				System.out.println("�̸�:"+vst.get(i).getName()); //���Ϳ��ִ� ���� get���� �ҷ�����
				System.out.println("�а�:"+vst.get(i).getDep());
				System.out.println("����:"+vst.get(i).getNum());
				System.out.println("���:"+vst.get(i).getAvg());
			}
			for(int i=0;i< vst.size(); i++) {
				System.out.print("�л��̸� >>");	
				name=sc.next();
				if(name.equals(vst.get(i).getName())) {
					System.out.println(vst.get(i).getName()+","+vst.get(i).getDep()+","+vst.get(i).getNum()+","+vst.get(i).getAvg());
				}
				if(name == "�׸�") 
					break;
				else 
					System.out.println("ã���ô� �л� ������ �����ϴ�");
			}

		}

	}
}
