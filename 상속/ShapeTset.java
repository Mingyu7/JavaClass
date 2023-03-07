
public class ShapeTset {

	public static void main(String[] args) {
		Shape[] s =new Shape[3];
		s[0]=new Shape(10, 10);
		s[1]=new Rectangle(10, 10, 10, 10);
		s[2]=new Circle(20, 20, 5);
		
		for(int i=0;i<s.length;i++) {
			s[i].print();
			s[i].calcArea();
			System.out.println();
		}
		/*
		Shape s = new Shape(10, 10);
		Rectangle r = new Rectangle(10, 10, 10, 10);
		Circle c = new Circle(20, 20, 5);
		
		s.print();
		s.calcArea();
		System.out.println();
		
		r.print();
		r.calcArea();
		System.out.println();
		
		c.print();
		c.calcArea();
		*/
	}

}
