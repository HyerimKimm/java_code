package javapractice;
import java.util.*;

//(x,y)의 한 점을 표현하는 Point 클래스와 이를 상속받아 점에 색을 추가한 ColorPoint 클래스를 만들고 활용하기
//super()를 이용하여 ColorPoint 클래스의 생성자에서 슈퍼 클래스 Point의 생성자를 호출

class Point{
	private int x, y;
	
	Point(){
		this.x = this.y = 0;
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void showPoint() { //점의 좌표 줄력
		System.out.println("("+x+", "+y+")");
	}
}

class ColorPoint extends Point{
	private String color; //점의 색
	
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
