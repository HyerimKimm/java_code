package javapractice;
import java.util.*;

//(x,y)�� �� ���� ǥ���ϴ� Point Ŭ������ �̸� ��ӹ޾� ���� ���� �߰��� ColorPoint Ŭ������ ����� Ȱ���ϱ�
//super()�� �̿��Ͽ� ColorPoint Ŭ������ �����ڿ��� ���� Ŭ���� Point�� �����ڸ� ȣ��

class Point{
	private int x, y;
	
	Point(){
		this.x = this.y = 0;
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void showPoint() { //���� ��ǥ �ٷ�
		System.out.println("("+x+", "+y+")");
	}
}

class ColorPoint extends Point{
	private String color; //���� ��
	
	ColorPoint(){
		super();
		this.color="Black";
	}
	
	ColorPoint (String color) {
		super();
		this.color=color;
	}
	
	ColorPoint(int x, int y, String color){
		super(x,y);
		this.color=color;
	}
	
	void showPointColor() {
		showPoint();
		System.out.println("color : "+color);
	}
}

public class ColorPointEx {
	public static void main(String[] args) {
		ColorPoint a;
		int x,y;
		String color;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x > ");
		x = scanner.nextInt();
		
		System.out.print("y > ");
		y = scanner.nextInt();
		
		System.out.print("color > ");
		color = scanner.next();
		
		a = new ColorPoint(x,y,color);
		a.showPointColor();
	}
}
