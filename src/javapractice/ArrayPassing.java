package javapractice;

//char[] �迭�� ���޹޾� �迭 ���� ����(' ')���ڸ� '.'���� ��ġ�ϴ� �޼ҵ带 �ۼ� 
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
