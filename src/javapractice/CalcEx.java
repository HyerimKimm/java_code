package javapractice;

class Calc{
	static int abs(int a) {
		return a>0?a:-a;
	}
	static int max(int a, int b) {
		return (a>b)?a:b;
	}
	static int min(int a, int b) {
		return (a>b)?b:a;
	}
}

public class CalcEx {
	public static void main(String[] args) {
		System.out.println(Calc.abs(-5));
		System.out.println(Calc.max(10,8));  //static 접근지정자 이므로 class명.메소드명으로 접근이 가능
		System.out.println(Calc.min(10, 8));
	}
}
