import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double avg =0.0;
		int[] score = new int[5];
		
		for(int i =0;i<score.length;i++)
		{
			System.out.println("성적입력["+i+"] >>");
			score[i]= sc.nextInt();
			 
		}
		/*
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
		}*/
		
		for(int s : score) {
			sum+=s;
		}
			
		avg=sum/score.length;
		System.out.println("평균점수 : "+avg);

	}

}
