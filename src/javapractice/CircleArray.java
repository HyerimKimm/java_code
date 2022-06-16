package javapractice;

//�������� 0~4�� Circle ��ü 5���� ������ �迭�� �����ϰ�, �迭�� �ִ� ��� Circle ��ü�� ������ ���
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
		this.author="���ڹ̻�";
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
			System.out.println("�������� "+c[i].radius+"�� ���� ������ "+String.format("%.1f", c[i].getArea())+"�Դϴ�.");
		}
	}
}