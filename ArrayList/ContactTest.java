import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Contact{
	private String name;
	private String phone;
	
	public Contact(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
public class ContactTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Contact> arr = new ArrayList<>();
		
		String name, phone;
		while(true) {
			System.out.print("이름 전화번호 입력>>");
			name = sc.next();
			if(name.equals("x")) break;
			phone = sc.next();
			
			Contact c = new Contact(name, phone);
			arr.add(c);
		}
		System.out.println();
		System.out.println("연락처 목록출력");
		/*
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i).getName()+"\t"+arr.get(i).getPhone());
		}
		*/
		/*
		for(Contact c : arr) {
			System.out.println(c.getName()+"\t"+c.getPhone());
		}
		*/
		
		Iterator<Contact> it = arr.iterator(); //인터프리터 사용
		while(it.hasNext()) {
			Contact c = it.next();
			System.out.println(c.getName()+"\t"+c.getPhone());
		}

	}

}
