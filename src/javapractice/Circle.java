package javapractice;

public class Circle {
	int radius;
	String name;
	
	public double getArea() {
		return radius*radius*3.14;
	}
	
	public static void main(String[] args) {
		Circle pizza = new Circle();
		pizza.name = "����� ����";
		pizza.radius = 10;
		System.out.println("������ ������ : "+pizza.getArea()+" �Դϴ�.");
	}
}
