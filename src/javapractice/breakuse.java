package javapractice;
import java.util.*;

public class breakuse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit을 입력하면 종료합니다.");
		
		while(true) {
			System.out.print(">>");
			String text = scanner.nextLine(); //공백이 없는 문자열을 입력받을 땐 scanner.next(), 공백이 있는 문자열을 입력받을 땐 scanner.nextLine()
			if(text.equals("exit")) break;
		}
		System.out.println("프로그램을 종료합니다...");
		scanner.close();
	}
}
