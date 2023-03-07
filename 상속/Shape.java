
public class Shape {
	int x,y;

	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	void print (){
		System.out.println("x좌표: "+x+"  y좌표: "+y);
		
	}
	void calcArea() {
		System.out.println("도형의 면적을 구함");
	}
	
}
