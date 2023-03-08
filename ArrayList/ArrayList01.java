import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new  ArrayList<>();
		
		 while(true){
	         System.out.print("품목입력>>");
	         String p = sc.next();
	         if(p.equals("종료")) break;
	         else arr.add(p);
	      }
	      
	      System.out.println();
	      System.out.print("장바구니 리스트:");
	      for(int i=0; i<arr.size(); i++) {
	         System.out.print(arr.get(i)+"   ");
	      }

		/*
		ArrayList<String> arr = new  ArrayList<>();
		arr.add("A");
		arr.add("B");
		arr.add("C");
		arr.add("D");
		
		
		arr.add(1,"AA"); // AA문자열 추가하기
		arr.remove(3); // "C" 문자열 3번째 배열 삭제
		arr.remove("A"); //"A" 문자열 삭제
		
		
		
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i)); //동적배열은 [] 사용가능 아닐시 get 사용
		}
		
		
		
		for(String s:arr) {
			System.out.println(s); //for each문 사용 `arr길이만큼 s에 저장`
		}
		
		
		Iterator<String> it=arr.iterator();
		while(it.hasNext()) {
			String s =it.next();
			System.out.println(s);
		}
		*/
	}

}
