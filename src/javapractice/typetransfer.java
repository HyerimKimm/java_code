package javapractice;

public class typetransfer {
	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		System.out.println(b+i); //227
		System.out.println(10/4); //2
		System.out.println(10.0/4); //4가 4.0으로 자동 변환, 2.5
		System.out.println((char)0x12340041); //16비트이므로 하위 2개 숫자의 문자 값(아스키코드) 계산
		System.out.println((byte)(b+i)); //227의 타입을 byte로 변경
	}
}
