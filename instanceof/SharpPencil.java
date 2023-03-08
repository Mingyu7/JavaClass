public class SharpPencil extends Pencil {

	private double width;

	public SharpPencil(String name, int amount, double width) {
		super(name, amount);
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public boolean equals(Object o) { // 오버라이딩

		if (o instanceof SharpPencil) {
			SharpPencil s = (SharpPencil) o;
			if (getName() == s.getName() && getAmount() == s.getAmount() && this.width == getWidth()) 
				return true;
			else
				return false;
		}
		return false;
		

	}

}
