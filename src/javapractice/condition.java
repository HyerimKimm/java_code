package javapractice;
import java.util.Scanner;

public class condition {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이를 입력하시오 : ");
		int age = scanner.nextInt();
		if((age>=20) && (age<30))
		{
			System.out.println("20대입니다.");
		}
		else
		{
			System.out.println("20대가아닙니다.");
		}
	}
}
