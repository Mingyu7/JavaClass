import java.util.Scanner;

public class RactangleTest {

	public static void main(String[] args) {
		Ractangle[] rect = new Ractangle[5];
		Scanner sc = new Scanner(System.in);
		/*
		 * for(int i=0;i<rect.length; i++) { rect[i]=new Ractangle(i+1,i+1); }
		 */
		for (int i = 0; i < rect.length; i++) {
			System.out.print(i + "번쩨 사각형의 가로, 세로 입력>>");
			int w = sc.nextInt();
			int h = sc.nextInt();

			rect[i] = new Ractangle(w, h);

		}
		for (int i = 0; i < rect.length; i++) {
			System.out.println(i + "번째 사각형 면적: " + rect[i].calcArea());
		}
		
		int totalArea=0;
		for(int i=0;i<rect.length;i++) {
			totalArea+=rect[i].calcArea();
		}
		System.out.println("모든 사각형의 면적합: "+totalArea);
	}

}
