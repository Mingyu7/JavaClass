
public class Person {
	private String name;
	private int age;
	private String ssn;
	
	Person(String name, int age, String ssn){
		this.name=name;
		this.age=age;
		this.ssn=ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	void print() {
		System.out.println("�̸�: "+getName());
		System.out.println("����: "+getAge());
		System.out.println("�ֹ�: "+getSsn());
	}
}
