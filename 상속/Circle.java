
public class Circle extends Shape {
	int radius;
	final double PI = 3.14;
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	void print() {
		super.print();
		System.out.println("반지름: "+radius);
	}
	void calcArea() {
		System.out.println("원의 면적: "+radius*radius*PI);
	}
	
}
