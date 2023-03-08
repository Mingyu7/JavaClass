
public class Professor extends Researcher {
	private String title;

	public Professor(String name, int age, String ssn, String field, String title) {
		super(name, age, ssn, field);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	void print() {
		super.print();
		System.out.println("СїБо: "+getTitle());
	}
}
