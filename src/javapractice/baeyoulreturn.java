package javapractice;
import java.util.*;

public class baeyoulreturn {
	
	static int[] makeArray() {
		int temp[] = new int[4];
		System.out.println("���� 4���� �Է��Ͻÿ� : ");
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<temp.length; i++)
		{
			temp[i] = scanner.nextInt();
		}
		return temp;
	}
	
	//������ ���� �迭�� �����Ͽ� �����ϴ� makeArray()�� �ۼ��ϰ�, �� �޼ҵ�κ��� �迭�� ���޹޴� ���α׷�
	public static void main(String[] args) {
		int intArray[];
		intArray = makeArray();
		
		System.out.print("intArray�� ���� : ");
		for(int i=0; i<intArray.length; i++) {
			System.out.print(intArray[i]+" ");
		}
	}
}
