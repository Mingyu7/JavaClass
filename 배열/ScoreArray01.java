
public class ScoreArray01 {

	public static void main(String[] args) {
		int [][] score= {
				{100,100,100}, 	//0번
				{80,80,80},		//1번
				{70,70,70},		//2번
				{60,60,60},		//3번	
				{50,50,50},		//4번
				
		};
		int sum=0; //학생의 총점
		double avg; //학생의 평균
		for(int i=0;i<score.length;i++) {
			sum=0;
			for(int j =0;j<score[i].length;j++) {
				sum+=score[i][j]; //학생별 총점과 평균
			}
			System.out.println(i+"번 합계"+sum+"평균:"+sum/score[i].length+"입니다.");
		}
		

	}

}
