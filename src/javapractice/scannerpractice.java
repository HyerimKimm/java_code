package javapractice;

import java.util.Scanner;

public class scannerpractice {
	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��Ͻÿ�");
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		String city = scanner.next();
		int age = scanner.nextInt();
		double weight = scanner.nextDouble();
		boolean single = scanner.nextBoolean();
		System.out.println("�̸� : "+name+"\n������ : "+city+"\n���� : "+age+"\nü�� : "+weight+"\n���� ���� : "+single);
	}
}

