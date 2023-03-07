
public class Starprint {

	public static void main(String[] args) {
		/*
		for(int i=0;i<5;i++) {
			for(int j=0;j<10;j++)
				System.out.print("*");
			System.out.println();
		}
		*/
		
		
		for(int i=0;i<=5;i++) { //»ï°¢Çü
			for(int j =0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0;i<=5;i++) {	//¿ª»ï°¢Çü
			for(int j =0;j<=5-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}	

	}

}
