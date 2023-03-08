
public class Researcher extends Person {
	private String field;

	public Researcher(String name, int age, String ssn, String field) {
		super(name, age, ssn);
		this.field = field;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
	
	void print() {
		super.print();
		System.out.println("연구분야: "+getField());
	}
}
