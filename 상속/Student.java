
public class Student extends Person {
	private String snum; //학번
	private String sdept; //학과
	
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
		System.out.println("수업을 들어요");
	}
	
	void print() {
		super.print();
		System.out.println("학번: "+getSnum());
		System.out.println("학과: "+getSdept());
	}
	
}
