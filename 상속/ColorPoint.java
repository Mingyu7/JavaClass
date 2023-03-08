
public class ColorPoint extends Point {
	private String color;

	ColorPoint(int x,int y,String color){
		super(x,y);
		this.color=color;
				
	}
	
	void setColor(String color) {
		this.color = color;
	}

	void showColor() {
		showPoint();
		System.out.println(color);

	}

}
