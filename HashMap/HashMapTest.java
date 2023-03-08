import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<>();
		
		dic.put("baby","�Ʊ�");
		dic.put("love","���");
		dic.put("apple","���");
		dic.put("water","��");
		dic.put("korea","�ѱ�");
		
		Scanner sc = new Scanner(System.in);
		
		Set<String> keys= dic.keySet();
		Iterator<String> it = keys.iterator();
		
		//���������� ����� �Ҷ� ����Ѵ� *�迭 ������� ��µ����� ����*
		while(it.hasNext()) {
			String key=it.next();
			String value=dic.get(key);
			System.out.println(key+"-->"+value);
		}
		
		
		while(true) {
			System.out.print("ã�� ���� �ܾ��? >>");
			String eng = sc.next();
			if(eng.equals("exit")) {
				System.out.println("���� �մϴ�.");
				break;
			}
			
			//�ؽøʿ��� �Է¹��� 'Ű'�� ���� '��' �˻�
			String kor=dic.get(eng); 
			if(kor==null) 
				System.out.println("ã�� �ܾ �����");
			else
				System.out.println("�ѱ� ����:"+kor);
		
					
		}
	}

}
