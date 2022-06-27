package javapractice;
import java.util.*;

public class IteratorEx {
	public static void main(String[] args) {
		//정수 값만 다루는 제네릭 벡터 생성
		Vector <Integer> v = new Vector<Integer>();
		v.add(5); //5 삽입
		v.add(4); //4 삽입
		v.add(-1); //-1 삽입
		v.add(2,100); //4와 -1 사이에 100 삽입   //5,4,100,-1
		
		//Iterator를 이용한 모든 정수 출력하기
		Iterator<Integer> it = v.iterator(); //Iterator 객체 얻기
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
	}
}
