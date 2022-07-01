package javapractice;
import java.util.*;

public class Singo {
	
	public static int[] solution(String[] id_list, String[] report, int k) {
		int [] answer = {};
		
		HashMap<String, HashSet<String>> id별신고자 = new HashMap<String, HashSet<String>>();
		
		for(String item : id_list) { //id_list의 item이 피신고자(HashMap의 Key)
			for(int i=0; i<report.length; i++) {
				HashSet<String> 신고자명단임시 = new HashSet<String>();
				String 신고자 = report[i].split("\\s")[0];
				String 피신고자 = report[i].split("\\s")[1];
				if(!(신고자명단임시.contains(신고자)) && 피신고자.equals(item) ) 신고자명단임시.add(신고자);
			}
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
