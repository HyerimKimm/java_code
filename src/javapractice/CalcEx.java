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
		System.out.println(Calc.max(10,8));  //static ���������� �̹Ƿ� class��.�޼ҵ������ ������ ����
		System.out.println(Calc.min(10, 8));
	}
}
