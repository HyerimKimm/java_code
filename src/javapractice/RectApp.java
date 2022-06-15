package javapractice;
import java.util.*;

//너비와 높이를 입력받아 사각형의 합을 출력하는 프로그램
class Rectangle{
	int weight;
	int height;
	String unit;
	public int getArea() {
		return weight*height;
	}
}

public class RectApp {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("너비를 입력하시오 >");
		rect.weight = scanner.nextInt();
		
		System.out.println("높이를 입력하시오 > ");
		rect.height = scanner.nextInt();
		
		System.out.println("단위를 입력하시오 > ");
		rect.unit = scanner.next();
		
		System.out.println("사각형의 면적은 "+rect.getArea()+rect.unit+"입니다.");
	}
}
