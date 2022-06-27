package javapractice;
import java.util.*;

public class ArrayListEx {
	public static void main(String[] args) {
		//문자열만 삽입 가능한 ArrayList 컬렉션 생성
		ArrayList <String> a = new ArrayList<String>();
		
		//키보드로부터 4개의 이름을 입력받아 ArrayList에 삽입
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		for(int i=0; i<4; i++) {
			String s = scanner.next();
			a.add(s);
		}
		//모든 이름을 출력
		for(int i=0;i<a.size();i++) {
			String name = a.get(i);
			System.out.print(name+" ");
		}
		System.out.println();
		//가장 긴 이름 출력
		int longestIndex=0;
		for (int i=1;i<a.size();i++) {
			if(a.get(longestIndex).length()<a.get(i).length()) {
				longestIndex=i;
			}
		}
		System.out.println("가장 긴 이름은 : "+a.get(longestIndex));
	}
}
