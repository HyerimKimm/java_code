package javapractice;

public class typetransfer {
	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		System.out.println(b+i); //227
		System.out.println(10/4); //2
		System.out.println(10.0/4); //4�� 4.0���� �ڵ� ��ȯ, 2.5
		System.out.println((char)0x12340041); //16��Ʈ�̹Ƿ� ���� 2�� ������ ���� ��(�ƽ�Ű�ڵ�) ���
		System.out.println((byte)(b+i)); //227�� Ÿ���� byte�� ����
	}
}
