package javapractice;

//반지름이 0~4인 Circle 객체 5개를 가지는 배열을 생성하고, 배열에 있는 모든 Circle 객체의 면적을 출력
class Circle{
	int radius;
	
	public Circle(int r) {
		this.radius = r;
	}
	public double getArea() {
		return radius*radius*3.14;
	}
}

class Book{
	String name;
	String author;
	
	public Book(String name){
		this.name=name;
		this.author="작자미상";
	}
	public Book(String name, String author){
		this.name=name;
		this.author=author;
	}
}

public class CircleArray {
	public static void main(String[] args) {
		Circle [] c;
		c = new Circle[5];
		
		for(int i=0; i<c.length; i++) {
			c[i] = new Circle(i+1);
			
		}
		
		for(int i=0; i<c.length; i++) {
			System.out.println("반지름이 "+c[i].radius+"인 원의 면적은 "+String.format("%.1f", c[i].getArea())+"입니다.");
		}
	}
}