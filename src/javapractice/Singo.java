//https://programmers.co.kr/learn/courses/30/lessons/92334

package javapractice;
import java.util.*;

public class Singo {
	public static int[] solution(String[] id_list, String[] report, int k) {
		int [] answer = {};
		
		HashMap<String,HashSet<String>> id���Ű�� = new HashMap<String,HashSet<String>>();
		HashSet<String> �ӽ�;
		
		//id�� �Ű���� ����
		for(int i=0; i<id_list.length; i++) {
			�ӽ� = id���Ű��.get(id_list[i]);
			id���Ű��.put(id_list[i],�ӽ�);
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
		int k = 2;
		
		int [] id����ȿ�ѽŰ�Ǽ� = solution(id_list,report,k);
		
		for(int i=0; i<id����ȿ�ѽŰ�Ǽ�.length; i++) {
			System.out.print(id����ȿ�ѽŰ�Ǽ�[i]+" ");
		}
	}
}
