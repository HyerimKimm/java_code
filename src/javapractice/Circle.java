package javapractice;

public class Circle {
	int radius;
	String name;
	
	public double getArea() {
		return radius*radius*3.14;
	}
	
	public static void main(String[] args) {
		Circle pizza = new Circle();
		pizza.name = "까르보네 피자";
		pizza.radius = 10;
		System.out.println("피자의 면적은 : "+pizza.getArea()+" 입니다.");
	}
}
