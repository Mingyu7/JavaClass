class Box {
	int width, length, height;
	int volumn;

	public Box(int width, int length, int height) {
		super();
		this.width = width;
		this.length = length;
		this.height = height;
		this.volumn = width * height * length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	int getArea() {
		return width * length * height;
	}

	boolean isSameVolumn(Box b) {
		if (this.volumn == b.volumn) { //곱하기 값 서로 같으면 true 다르면 false
			return true;
		} else {
			return false;
		}
	}
}

public class BoxTest {

	public static void main(String[] args) {
		Box b1=new Box(10,10,10); 
		Box b2=new Box(11,10,20);
		
		System.out.println("박스1: "+b1.getWidth()+", "+b1.getHeight()+", "+b1.getLength());
		System.out.println("박스2: "+b2.getWidth()+", "+b2.getHeight()+", "+b2.getLength());
		
		System.out.println("두 박스는 용량이 같은가?>>"+b1.isSameVolumn(b2));

	}

}
