package javapractice;
import java.util.*;

public class Singo {
	public static int[] solution(String[] id_list, String[] report, int k) {
		int [] answer = new int[id_list.length];
		Arrays.fill(answer, 0);
		
		HashMap<String, HashSet<String>> id별신고자 = new HashMap<String, HashSet<String>>();
		
		//id_list 값을 키로 추가
		for(String item : id_list) 	id별신고자.put(item, new HashSet<String>());
		
		//피신고자 당 신고자를 중복되지 않게 등록
		for(int i=0; i<id_list.length; i++) {
			for(int j=0; j<report.length; j++) {
				String 피신고자임시 = report[j].split("\\s")[1];
				String 신고자임시 = report[j].split("\\s")[0];
				
				if(!(id별신고자.get(신고자임시).contains(피신고자임시)) && id_list[i].equals(피신고자임시)) {
					id별신고자.get(피신고자임시).add(신고자임시);
				}
			}
		}
		
		//id별 메일 받을 건수 저장
		for(String item : id_list) {
			for(int j=0; j<id_list.length; j++) {
				if(id별신고자.get(item).size()>=k) { //피신고자의 신고건수가 k이상이면 갯수 세기
					answer[j] += Collections.frequency(id별신고자.get(item), id_list[j]);
				}
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
