import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new  ArrayList<>();
		
		 while(true){
	         System.out.print("ǰ���Է�>>");
	         String p = sc.next();
	         if(p.equals("����")) break;
	         else arr.add(p);
	      }
	      
	      System.out.println();
	      System.out.print("��ٱ��� ����Ʈ:");
	      for(int i=0; i<arr.size(); i++) {
	         System.out.print(arr.get(i)+"   ");
	      }

		/*
		ArrayList<String> arr = new  ArrayList<>();
		arr.add("A");
		arr.add("B");
		arr.add("C");
		arr.add("D");
		
		
		arr.add(1,"AA"); // AA���ڿ� �߰��ϱ�
		arr.remove(3); // "C" ���ڿ� 3��° �迭 ����
		arr.remove("A"); //"A" ���ڿ� ����
		
		
		
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i)); //�����迭�� [] ��밡�� �ƴҽ� get ���
		}
		
		
		
		for(String s:arr) {
			System.out.println(s); //for each�� ��� `arr���̸�ŭ s�� ����`
		}
		
		
		Iterator<String> it=arr.iterator();
		while(it.hasNext()) {
			String s =it.next();
			System.out.println(s);
		}
		*/
	}

}
