package javapractice;

class Shape{
	 void draw() {
		System.out.print("Shape");
	}
}

class Line extends Shape{
	 void draw() {
		System.out.println("Line");
	}
}


class Rect extends Shape{
	void draw() {
		System.out.println("Rect");
	}
}


public class MethodOverridingEx {
	static void paint(Shape p) {
		p.draw();
	}
	public static void main(String[] args) {
		Line line = new Line();
		paint(line);
		paint(new Rect());
	}
}

