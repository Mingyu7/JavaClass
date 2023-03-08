import javax.naming.ldap.HasControls;

class Point {
	int x,y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public String toString() {
		String s ="x="+x+", y="+y;
		return s;
	}
	public boolean equals(Object o) {
		Point  p=(Point)o;
		if(x==p.x && y==p.y)
			return true;
		else
			return false;
	}
}

public class PointTest {

	public static void print(Object ob) {
		System.out.println(ob.getClass().getName());
		System.out.println(ob.hashCode());
		System.out.println(ob.toString());
		System.out.println(ob);
	}
	
	public static void main(String[] args) {
		Point p1 = new Point(2,3);
		Point p2 = new Point(2,3);
		if(p1.equals(p2))
				System.out.println("동일");
		else
			System.out.println("다름");
		//PointTest.print(p1);
		System.out.println(p1.getClass().getName());
		System.out.println(p1.hashCode());
		System.out.println(p1.toString());
		System.out.println(p1);
	}
	

}
