package javapractice;
import java.util.*;

public class dachawonbaeyoul {
	public static void main(String[] args) {
		double score[][] = new double[4][2];
		double sum = 0;
		double avg = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("전 학년 성적을 학기별로 입력하시오 : ");
		
		for(int i=0; i<score.length; i++) {
			for(int j=0;j<score[i].length;j++) {
				score[i][j] = scanner.nextDouble();
				sum+=score[i][j];
			}
		}
		scanner.close();
		
		avg = sum/8;
		
		System.out.println("총 학점 : "+String.format("%.2f", sum));
		System.out.println("평균 학점 : "+String.format("%.2f", avg));
	}
}
