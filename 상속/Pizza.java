class Circle {
	int radius; // 반지름
	final double PI = 3.14;

	Circle(int radius) { // 생성자
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	double calcArea() { // 면적구하기
		return radius * radius * PI;
	}
}

public class Pizza extends Circle {
	String topping;

	Pizza(int radius,String topping) {
		super(radius);
		this.topping=topping;
	}

	public String getTopping() {
		return topping;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}
	
	void print() {
		System.out.println("*** 피자 출력 ***");
		System.out.println("피자 반지름>>"+radius);
		System.out.println("피자 토핑>>"+topping);
		System.out.println("피자 면적: "+calcArea());
	}

}
