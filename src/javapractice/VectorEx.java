package javapractice;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		//정수 값만 다루는 제네릭 벡터 생성
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(5);
		v.add(4);
		v.add(-1);
		
		//벡터 중간에 삽입하기
		v.add(2,100);
		
		System.out.println("벡터 내의 요소 객체 수 : "+v.size());
		System.out.println("벡터 내의 현재 용량 : "+v.capacity());//벡터의 디폴트 용량
		
		//모든 요소 정수 출력하기
		for(int i=0; i<v.size(); i++) {
			int n = v.get(i);
			System.out.print(n+" ");
		}
	}
}
