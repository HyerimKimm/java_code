package javapractice;
import java.util.*;

public class arraypractice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int intArray[] = new int[5];
		int max = 0; //���� ���� ū ��
		System.out.println("��� 5���� �Է��ϼ���.");
		for(int i=0; i<5; i++) {
			intArray[i] = scanner.nextInt();
			max = (intArray[i]>max)? max=intArray[i] : max;
		}
		System.out.println("���� ū ���� "+max+"�Դϴ�.");
		scanner.close();
	}
}
