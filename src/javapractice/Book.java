package javapractice;

//제목과 저자를 나타내는 title과 author필드를 가진 Book 클래스를 작성하고, 생성자를 작성하여 필드를 초기화. 
public class Book {
	String title;
	String author;
	
	public Book(String title) {
		this.title = title;
		this.author = "작자미상";
	}
	
	public Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	public static void main(String[] args) {
		Book book1 = new Book("어린왕자","생택쥐페리");
		Book book2 = new Book("춘향전");
		
		System.out.println("책 1 : "+book1.title+", "+book1.author);
		System.out.println("책 2 : "+book2.title+", "+book2.author);
	}
}

