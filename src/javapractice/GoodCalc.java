package javapractice;

abstract class Calculator{
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int [] a);
}

public class GoodCalc extends Calculator{
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	@Override
	public int subtract(int a, int b) {
		return a-b;
	}
	@Override
	public double average(int[] a) {
		int sum = 0;
		double avg;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		avg = sum /(double)a.length;
		return avg;
	}
	public static void main(String[] args) {
		GoodCalc c = new GoodCalc();
		
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int [] {2,3,5}));
	}
}
