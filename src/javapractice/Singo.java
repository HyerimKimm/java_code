package javapractice;
import java.util.*;

public class Singo {
	
	public static int[] solution(String[] id_list, String[] report, int k) {
		int [] answer = {};
		
		HashMap<String, HashSet<String>> id���Ű��� = new HashMap<String, HashSet<String>>();
		
		for(String item : id_list) { //id_list�� item�� �ǽŰ���(HashMap�� Key)
			for(int i=0; i<report.length; i++) {
				HashSet<String> �Ű��ڸ���ӽ� = new HashSet<String>();
				String �Ű��� = report[i].split("\\s")[0];
				String �ǽŰ��� = report[i].split("\\s")[1];
				if(!(�Ű��ڸ���ӽ�.contains(�Ű���)) && �ǽŰ���.equals(item) ) �Ű��ڸ���ӽ�.add(�Ű���);
			}
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
