
public class Student {
	private String name;
	private int studentNo;
	private int score[] = new int[3];
	private int total;
	private double Ave;

	
	public Student(int[] score) {
		super();
		this.score = score;
	}

	public Student(String name, int studentNo, int[] score) {
		super();
		this.name = name;
		this.studentNo = studentNo;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public int[] getScore() {
		return score;
	}

	public void setScore(int[] score) {
		this.score = score;
	}

	public int getTotal() {
		for (int i = 0; i < score.length; i++)
			total += score[i];
		return total;
	}

	public double getAvg() {
		Ave = total / score.length;
		return (double) Ave;
	}

}
