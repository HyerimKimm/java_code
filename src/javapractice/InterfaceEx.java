package javapractice;

interface PhoneInterface{
	final int TIMEOUT = 10000; //ÀÎÅÍÆäÀÌ½ºÀÇ »ó¼ö´Â public static final
	void sendcall();
	void receiveCall();  //Ãß»ó ¸Þ¼Òµå´Â ¹«Á¶°Ç public void ÀÓ
	default void printLogo() { //default ¸Þ¼Òµå
		System.out.println("**Phone**");
	}
}

class SamsungPhone implements PhoneInterface{

	@Override
	public void sendcall() {
		System.out.println("¶ì¸®¸®¸®¸µ");
	}

	@Override
	public void receiveCall() {
		System.out.println("ÀüÈ­¹Þ¾Æ!");
	}
}

class Iphone implements PhoneInterface{
	
	@Override
	public void sendcall() {
		System.out.println("¶í¶í¶ì¸®µò");
	}
	
	@Override
	public void receiveCall() {
		System.out.println("¶ì¶ì¶ì¶ì¶ì¶ì");
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
