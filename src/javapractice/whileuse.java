package javapractice;
import java.util.*;

//�Է��� ������ ����� ����ϴ� ���α׷�
public class whileuse {
	public static void main(String[] args) {
		int cnt=0, num=0, sum=0;
		double avg=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϰ� �������� 0�� �Է��ϼ���.");
		while((num=scanner.nextInt())!=0) {
			sum+=num;
			cnt+=1;
		}
		avg=(double)sum/(double)cnt;
		System.out.println("���� ������ "+cnt+"�̸�");
		System.out.println("����� "+avg+"�Դϴ�.");
	}
}