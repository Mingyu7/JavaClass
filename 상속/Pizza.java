class Circle {
	int radius; // ������
	final double PI = 3.14;

	Circle(int radius) { // ������
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	double calcArea() { // �������ϱ�
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
		System.out.println("*** ���� ��� ***");
		System.out.println("���� ������>>"+radius);
		System.out.println("���� ����>>"+topping);
		System.out.println("���� ����: "+calcArea());
	}

}
