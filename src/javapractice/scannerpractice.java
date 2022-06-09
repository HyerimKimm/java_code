package javapractice;

import java.util.Scanner;

public class scannerpractice {
	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하시오");
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		String city = scanner.next();
		int age = scanner.nextInt();
		double weight = scanner.nextDouble();
		boolean single = scanner.nextBoolean();
		System.out.println("이름 : "+name+"\n거주지 : "+city+"\n나이 : "+age+"\n체중 : "+weight+"\n독신 여부 : "+single);
	}
}

