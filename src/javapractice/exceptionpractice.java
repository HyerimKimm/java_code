package javapractice;
import java.util.*;

public class exceptionpractice {
	//�� ������ �Է¹޾� �������� �ϰ� ���� ���ϴ� ���α׷�
	public static void main(String[] args) {
		int dividend, divisor;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�������� �Է��Ͻÿ� : ");
		dividend = scanner.nextInt();
		System.out.println("�������� �Է��Ͻÿ� : ");
		divisor = scanner.nextInt();
		
		try {
			System.out.println(dividend+"�� "+divisor+"�� ���� ���� "+dividend/divisor+"�Դϴ�.");
		}catch(ArithmeticException e){ 
			System.exit(0);
		}finally {
			scanner.close();
		}
	}
}
