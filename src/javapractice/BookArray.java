package javapractice;
import java.util.*;

//2개짜리 Book 객체 배열을 만들고, 사용자로부터 책의 제목과 저자를 입력받아 배열을 완성하기
public class BookArray {
	public static void main(String[] args) {
		Book[] bookArray;
		bookArray = new Book[2];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<bookArray.length; i++) {
			System.out.print("제목 > ");
			String title = scanner.nextLine();
			System.out.print("작가 > ");
			String author = scanner.nextLine();
			
			if(author.isEmpty()) bookArray[i] = new Book(title);
			else bookArray[i] = new Book(title,author);
		}
		
		for(int i=0; i<bookArray.length; i++) {
			System.out.println("book"+i+"의 제목 : "+bookArray[i].name+", 작가 : "+bookArray[i].author);
		}
	}
}
