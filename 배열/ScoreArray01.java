
public class ScoreArray01 {

	public static void main(String[] args) {
		int [][] score= {
				{100,100,100}, 	//0��
				{80,80,80},		//1��
				{70,70,70},		//2��
				{60,60,60},		//3��	
				{50,50,50},		//4��
				
		};
		int sum=0; //�л��� ����
		double avg; //�л��� ���
		for(int i=0;i<score.length;i++) {
			sum=0;
			for(int j =0;j<score[i].length;j++) {
				sum+=score[i][j]; //�л��� ������ ���
			}
			System.out.println(i+"�� �հ�"+sum+"���:"+sum/score[i].length+"�Դϴ�.");
		}
		

	}

}
