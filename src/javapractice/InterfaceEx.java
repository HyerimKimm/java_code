package javapractice;

interface PhoneInterface{
	final int TIMEOUT = 10000; //�������̽��� ����� public static final
	void sendcall();
	void receiveCall();  //�߻� �޼ҵ�� ������ public void ��
	default void printLogo() { //default �޼ҵ�
		System.out.println("**Phone**");
	}
}

class SamsungPhone implements PhoneInterface{

	@Override
	public void sendcall() {
		System.out.println("�츮������");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ�޾�!");
	}
}

class Iphone implements PhoneInterface{
	
	@Override
	public void sendcall() {
		System.out.println("���츮��");
	}
	
	@Override
	public void receiveCall() {
		System.out.println("�������");
	}
}


public class InterfaceEx {
	public static void main(String[] args) {
		SamsungPhone galaxyA7 = new SamsungPhone();
		Iphone iphone13 = new Iphone();
		
		galaxyA7.printLogo();
		galaxyA7.receiveCall();
		
		iphone13.printLogo();
		iphone13.receiveCall();
		
	}
}
