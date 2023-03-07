
public class Student {
	private String snum;
	private String sname;
	private String sdept;
	
	public Student(String snum, String sname, String sdept) {
		super();
		this.snum = snum;
		this.sname = sname;
		this.sdept = sdept;
	}

	public String getSnum() {
		return snum;
	}

	public void setSnum(String snum) {
		this.snum = snum;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSdept() {
		return sdept;
	}

	public void setSdept(String sdept) {
		this.sdept = sdept;
	}
	
	
}
