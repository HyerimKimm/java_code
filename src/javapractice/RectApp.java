package javapractice;
import java.util.*;

//�ʺ�� ���̸� �Է¹޾� �簢���� ���� ����ϴ� ���α׷�
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
		
		System.out.println("�ʺ� �Է��Ͻÿ� >");
		rect.weight = scanner.nextInt();
		
		System.out.println("���̸� �Է��Ͻÿ� > ");
		rect.height = scanner.nextInt();
		
		System.out.println("������ �Է��Ͻÿ� > ");
		rect.unit = scanner.next();
		
		System.out.println("�簢���� ������ "+rect.getArea()+rect.unit+"�Դϴ�.");
	}
}
