import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<>();
		
		dic.put("baby","아기");
		dic.put("love","사랑");
		dic.put("apple","사과");
		dic.put("water","물");
		dic.put("korea","한국");
		
		Scanner sc = new Scanner(System.in);
		
		Set<String> keys= dic.keySet();
		Iterator<String> it = keys.iterator();
		
		//순차적으로 출력을 할때 사용한다 *배열 순서대로 출력되지는 않음*
		while(it.hasNext()) {
			String key=it.next();
			String value=dic.get(key);
			System.out.println(key+"-->"+value);
		}
		
		
		while(true) {
			System.out.print("찾고 싶은 단어는? >>");
			String eng = sc.next();
			if(eng.equals("exit")) {
				System.out.println("종료 합니다.");
				break;
			}
			
			//해시맵에서 입력받은 '키'에 대한 '값' 검색
			String kor=dic.get(eng); 
			if(kor==null) 
				System.out.println("찾는 단어가 없어요");
			else
				System.out.println("한글 번역:"+kor);
		
					
		}
	}

}
