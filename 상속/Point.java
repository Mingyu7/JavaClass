
public class Point {
	private int x, y;
	
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void showPoint() {
		System.out.println("x: "+x+","+"y: "+y);
	}
}
