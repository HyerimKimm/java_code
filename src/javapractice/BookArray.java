package javapractice;
import java.util.*;

//2��¥�� Book ��ü �迭�� �����, ����ڷκ��� å�� ����� ���ڸ� �Է¹޾� �迭�� �ϼ��ϱ�
public class BookArray {
	public static void main(String[] args) {
		Book[] bookArray;
		bookArray = new Book[2];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<bookArray.length; i++) {
			System.out.print("���� > ");
			String title = scanner.nextLine();
			System.out.print("�۰� > ");
			String author = scanner.nextLine();
			
			if(author.isEmpty()) bookArray[i] = new Book(title);
			else bookArray[i] = new Book(title,author);
		}
		
		for(int i=0; i<bookArray.length; i++) {
			System.out.println("book"+i+"�� ���� : "+bookArray[i].name+", �۰� : "+bookArray[i].author);
		}
	}
}
