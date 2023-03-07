class SharpPencil { 
	private int width;
	private int amount; 
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}

class BallPen extends SharpPencil { 

	private String color; 

	public BallPen(int amount, String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

class FountainPen extends BallPen { 

	public FountainPen(int amount, String color) {
		super(amount, color);

	}

	public void refill(int n) {
		int amount = n;
	}
}
