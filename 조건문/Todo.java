
public class Todo {
	private String time;
	private String work;

	public Todo(String time, String work) {
		super();
		this.time = time;
		this.work = work;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}
	
	void show() {
		if(work=="") System.out.println("일정이 없습니다");
		else System.out.println(work+":"+time);
		
	
	}

}
