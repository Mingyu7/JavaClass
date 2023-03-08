
public class Student extends Person {
	private String snum; //�й�
	private String sdept; //�а�
	
	public Student(String name, int age, String ssn,String snum, String sdept) {
		super(name, age, ssn);
		this.snum=snum;
		this.sdept=sdept;
	}

	

	public String getSnum() {
		return snum;
	}

	public void setSnum(String snum) {
		this.snum = snum;
	}

	public String getSdept() {
		return sdept;
	}

	public void setSdept(String sdept) {
		this.sdept = sdept;
	}
	
	public void study() {
		System.out.println("������ ����");
	}
	
	void print() {
		super.print();
		System.out.println("�й�: "+getSnum());
		System.out.println("�а�: "+getSdept());
	}
	
}
