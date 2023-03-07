
public class Rectangle extends Shape  {
	int width, height;

	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {	
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	void print() {
		//System.out.println("x��ǥ: "+x+"y��ǥ: "+y);
		super.print(); // �θ� ����Ų�� Shape print�޼ҵ� �ҷ��´�
		System.out.println("����: "+width+"  ����: "+height);
	}
	void calcArea() {
		System.out.println("�簢�� ����: "+(width*height));
	}

}	
