package javapractice;
import java.util.*;

public class breakuse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit�� �Է��ϸ� �����մϴ�.");
		
		while(true) {
			System.out.print(">>");
			String text = scanner.nextLine(); //������ ���� ���ڿ��� �Է¹��� �� scanner.next(), ������ �ִ� ���ڿ��� �Է¹��� �� scanner.nextLine()
			if(text.equals("exit")) break;
		}
		System.out.println("���α׷��� �����մϴ�...");
		scanner.close();
	}
}
