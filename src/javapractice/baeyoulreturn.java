package javapractice;
import java.util.*;

public class baeyoulreturn {
	
	static int[] makeArray() {
		int temp[] = new int[4];
		System.out.println("정수 4개를 입력하시오 : ");
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<temp.length; i++)
		{
			temp[i] = scanner.nextInt();
		}
		return temp;
	}
	
	//일차원 정수 배열을 생성하여 리턴하는 makeArray()를 작성하고, 이 메소드로부터 배열을 전달받는 프로그램
	public static void main(String[] args) {
		int intArray[];
		intArray = makeArray();
		
		System.out.print("intArray의 원소 : ");
		for(int i=0; i<intArray.length; i++) {
			System.out.print(intArray[i]+" ");
		}
	}
}
