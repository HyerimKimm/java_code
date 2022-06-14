package javapractice;
import java.util.*;

public class arraypractice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int intArray[] = new int[5];
		int max = 0; //현재 가장 큰 수
		System.out.println("양수 5개를 입력하세요.");
		for(int i=0; i<5; i++) {
			intArray[i] = scanner.nextInt();
			max = (intArray[i]>max)? max=intArray[i] : max;
		}
		System.out.println("가장 큰 수는 "+max+"입니다.");
		scanner.close();
	}
}
