package javapractice;
import java.util.*;

public class ArrayListEx {
	public static void main(String[] args) {
		//���ڿ��� ���� ������ ArrayList �÷��� ����
		ArrayList <String> a = new ArrayList<String>();
		
		//Ű����κ��� 4���� �̸��� �Է¹޾� ArrayList�� ����
		Scanner scanner = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		for(int i=0; i<4; i++) {
			String s = scanner.next();
			a.add(s);
		}
		//��� �̸��� ���
		for(int i=0;i<a.size();i++) {
			String name = a.get(i);
			System.out.print(name+" ");
		}
		System.out.println();
		//���� �� �̸� ���
		int longestIndex=0;
		for (int i=1;i<a.size();i++) {
			if(a.get(longestIndex).length()<a.get(i).length()) {
				longestIndex=i;
			}
		}
		System.out.println("���� �� �̸��� : "+a.get(longestIndex));
	}
}
