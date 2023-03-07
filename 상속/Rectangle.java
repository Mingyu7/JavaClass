
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
		//System.out.println("x좌표: "+x+"y좌표: "+y);
		super.print(); // 부모를 가리킨다 Shape print메소드 불러온다
		System.out.println("가로: "+width+"  세로: "+height);
	}
	void calcArea() {
		System.out.println("사각형 면적: "+(width*height));
	}

}	
