package javapractice;

//char[] 배열을 전달받아 배열 속의 공백(' ')문자를 '.'으로 대치하는 메소드를 작성 
public class ArrayPassing {
	static void replaceSpace(char a[]) {
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==' ')a[i]='.';
		}
	}
	static void printCharArray(char a[]) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
		}
	}
	
	public static void main(String[] args) {
		char c[]= {'T','h','i','s',' ','i','s',' ','a'};
		replaceSpace(c);
		printCharArray(c);
	}
}
