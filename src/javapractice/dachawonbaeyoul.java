package javapractice;
import java.util.*;

public class dachawonbaeyoul {
	public static void main(String[] args) {
		double score[][] = new double[4][2];
		double sum = 0;
		double avg = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�� �г� ������ �б⺰�� �Է��Ͻÿ� : ");
		
		for(int i=0; i<score.length; i++) {
			for(int j=0;j<score[i].length;j++) {
				score[i][j] = scanner.nextDouble();
				sum+=score[i][j];
			}
		}
		scanner.close();
		
		avg = sum/8;
		
		System.out.println("�� ���� : "+String.format("%.2f", sum));
		System.out.println("��� ���� : "+String.format("%.2f", avg));
	}
}
