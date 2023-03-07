package object01;

public class double01 {

	public static void main(String[] args) {
		int count = 0;
		for (int a = 0; a < 10; a++) { //a = 9까지 실행 10번 반복
			for (int i = 0; i < 5; i++) { // i = 4까지 실행 5번 반복
				System.out.println("*"); //한줄당 별하나 출력
				System.out.println(" *"); //다음줄에 띄워서 별 출력
				count++;				 // 5*10 = 50번 반복	
			}
		}

		System.out.println(count); //count = 50
	}

}
