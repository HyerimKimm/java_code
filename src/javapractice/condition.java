package javapractice;
import java.util.Scanner;

public class condition {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���̸� �Է��Ͻÿ� : ");
		int age = scanner.nextInt();
		if((age>=20) && (age<30))
		{
			System.out.println("20���Դϴ�.");
		}
		else
		{
			System.out.println("20�밡�ƴմϴ�.");
		}
	}
}
