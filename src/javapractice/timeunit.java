package javapractice;
import java.util.Scanner;

public class timeunit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("초단위의 정수를 입력하세요 : ");
		int time = scanner.nextInt();
		
		int second = time%60;
		int minute = time/60%60;
		int hour = time/60/60;
		
		System.out.println(hour+"시간");
		System.out.println(minute+"분");
		System.out.println(second+"초");
	}
}
