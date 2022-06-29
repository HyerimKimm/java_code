//https://programmers.co.kr/learn/courses/30/lessons/92334

package javapractice;
import java.util.*;

public class Singo {
	public static int[] solution(String[] id_list, String[] report, int k) {
		int [] answer = {};
		
		HashMap<String,HashSet<String>> id별신고건 = new HashMap<String,HashSet<String>>();
		HashSet<String> 임시;
		
		//id별 신고건을 저장
		for(int i=0; i<id_list.length; i++) {
			임시 = id별신고건.get(id_list[i]);
			id별신고건.put(id_list[i],임시);
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
		int k = 2;
		
		int [] id별유효한신고건수 = solution(id_list,report,k);
		
		for(int i=0; i<id별유효한신고건수.length; i++) {
			System.out.print(id별유효한신고건수[i]+" ");
		}
	}
}
