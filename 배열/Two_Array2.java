import java.util.Scanner;

public class Two_Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] number = { { 1, 2, 3, 4, 3, 1, 4, 2, 2, 1 }, { 3, 2, 4, 2, 2, 1, 1, 3, 4, 1 },
				{ 4, 3, 2, 2, 1, 2, 3, 2, 1, 4 }, { 2, 3, 1, 1, 3, 2, 1, 2, 2, 3 }, { 4, 3, 1, 1, 1, 1, 1, 2, 2, 3 } };

		int[] answer = new int[10];
		int score;
		Scanner sc = new Scanner(System.in);

		System.out.print("정답을 입력하세요 : >>");

		for (int i=0;i<answer.length;i++) {
			answer[i] = sc.nextInt();
		} // i를 10개까지(answer배열의 길이까지) 증가시키면서 스캐너로 배열 answer[i]에 저장.

		for (int i = 0; i <= 4; i++) { // 답안이 4까지니깐.
			score = 0;
			for (int j = 0; j < 10; j++) {
				if (number[i][j] == answer[j])
					score++; // number의 i가 답안4개중 1개이고 j의 10개까지가 == answer[j](스캐너가 입력한 10개의 수)가 맞을때 score가 1개씩
								// 증가.
			}

			System.out.println("학생 " + (i + 1) + ":" + score+"점");
		}
	}

}
