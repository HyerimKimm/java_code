package javapractice;

//����� ���ڸ� ��Ÿ���� title�� author�ʵ带 ���� Book Ŭ������ �ۼ��ϰ�, �����ڸ� �ۼ��Ͽ� �ʵ带 �ʱ�ȭ. 
public class Book {
	String title;
	String author;
	
	public Book(String title) {
		this.title = title;
		this.author = "���ڹ̻�";
	}
	
	public Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	public static void main(String[] args) {
		Book book1 = new Book("�����","�������丮");
		Book book2 = new Book("������");
		
		System.out.println("å 1 : "+book1.title+", "+book1.author);
		System.out.println("å 2 : "+book2.title+", "+book2.author);
	}
}

