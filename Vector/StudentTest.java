import java.util.Scanner;
import java.util.Vector;


public class StudentTest {

	public static void main(String[] args) {
		String str = ""; //문자열 저장
		String name = "";
		String dep = "";
		int num = 0;
		double avg = 0;

		Scanner sc = new Scanner(System.in);
		Vector<Student> vst = new Vector<>();

		System.out.println("학생 이름, 학과, 학번, 학점평균을 입력하세요.");
		while (true) {		
			
			for (int i = 1;i <= 4; i++) {
				System.out.print(">>");
				str = sc.nextLine();
				
				// str문자열 "," 기준 으로 나눠서 저장
				String[] Sarr = str.split(","); 
				name = Sarr[0];
				dep = Sarr[1];				
				num = Integer.parseInt(Sarr[2]);
				avg = Double.parseDouble(Sarr[3]);
				
				Student s = new Student(name, dep, num, avg); //객체에 정보 저장
				vst.add(s); //벡터에 객체 저장
			}

			for (int i = 0; i < vst.size(); i++) {
				System.out.println("--------------------------");
				System.out.println("이름:"+vst.get(i).getName()); //벡터에있는 정보 get으로 불러오기
				System.out.println("학과:"+vst.get(i).getDep());
				System.out.println("학점:"+vst.get(i).getNum());
				System.out.println("평균:"+vst.get(i).getAvg());
			}
			for(int i=0;i< vst.size(); i++) {
				System.out.print("학생이름 >>");	
				name=sc.next();
				if(name.equals(vst.get(i).getName())) {
					System.out.println(vst.get(i).getName()+","+vst.get(i).getDep()+","+vst.get(i).getNum()+","+vst.get(i).getAvg());
				}
				if(name == "그만") 
					break;
				else 
					System.out.println("찾으시는 학생 정보가 없습니다");
			}

		}

	}
}
