package javapractice;
import java.util.*;

public class exceptionpractice {
	//두 정수를 입력받아 나눗셈을 하고 몫을 구하는 프로그램
	public static void main(String[] args) {
		int dividend, divisor;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("나뉨수를 입력하시오 : ");
		dividend = scanner.nextInt();
		System.out.println("나눗수를 입력하시오 : ");
		divisor = scanner.nextInt();
		
		try {
			System.out.println(dividend+"를 "+divisor+"로 나눈 수는 "+dividend/divisor+"입니다.");
		}catch(ArithmeticException e){ 
			System.exit(0);
		}finally {
			scanner.close();
		}
	}
}
