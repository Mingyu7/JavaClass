class Employee {
	private String name;
	private double Salary;
	private String birthDate;
	private final long Base_Salary=100;
	public Employee(String name,double Salary,String birthDate) {
		this.name=name;
		this.Salary=Salary;
		this.birthDate=birthDate;		
	}
	public Employee(String name) { //생성자 오버로딩
		this.name=name;
		Salary=Base_Salary;
		birthDate="1980-01-01";
	}
	
	public String getDetails() {		
		return name+"  "+Salary+"   "+birthDate;
	}
}

class Manager extends Employee {
	private String dept;
	public Manager(String name, double Salary, String birthDate,String dept) {
		super(name, Salary, birthDate);
		this.dept=dept;
		
	}
	
	public String getDetails(String name,double Salary,String birthDate,String dept) { //메소드 오버라이딩
		return name+"  "+Salary+"  "+birthDate+" "+dept;
	}
	
	
}

public class EmployeeTest {

	public static void main(String[] args) {
		Employee Em1 = new Employee("김영수");
		Employee Em2 = new Employee("이윤호",11000.0,"1980-04-20");
		Manager Ma1 = new Manager("강현수",230000.0,"1979-11-08","부서");
		System.out.println("이름"+"    "+"급여"+"    "+"생년월일");
		System.out.println("==========================");
		System.out.println(Em1.getDetails());
		System.out.println(Em2.getDetails());
		System.out.println(Ma1.getDetails());
	}

}
