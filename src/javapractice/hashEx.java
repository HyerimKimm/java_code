package javapractice;

public class hashEx {
	public static boolean solution(String[] phone_book) {
		for(int i=0; i<phone_book.length-1; i++) {
			for(int j=1; j<phone_book.length; j++) {
				if(j==i) continue;
				if(phone_book[i].startsWith(phone_book[j])) return false;
				if(phone_book[j].startsWith(phone_book[i])) return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223", "1195524421"};
		boolean answer = solution(phone_book);
		System.out.println(answer);
	}
}
