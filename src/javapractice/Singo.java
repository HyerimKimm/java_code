package javapractice;
import java.util.*;

public class Singo {
	public static int[] solution(String[] id_list, String[] report, int k) {
		int [] answer = new int[id_list.length];
		Arrays.fill(answer, 0);
		
		HashMap<String, HashSet<String>> id���Ű��� = new HashMap<String, HashSet<String>>();
		
		//id_list ���� Ű�� �߰�
		for(String item : id_list) 	id���Ű���.put(item, new HashSet<String>());
		
		//�ǽŰ��� �� �Ű��ڸ� �ߺ����� �ʰ� ���
		for(int i=0; i<id_list.length; i++) {
			for(int j=0; j<report.length; j++) {
				String �ǽŰ����ӽ� = report[j].split("\\s")[1];
				String �Ű����ӽ� = report[j].split("\\s")[0];
				
				if(!(id���Ű���.get(�Ű����ӽ�).contains(�ǽŰ����ӽ�)) && id_list[i].equals(�ǽŰ����ӽ�)) {
					id���Ű���.get(�ǽŰ����ӽ�).add(�Ű����ӽ�);
				}
			}
		}
		
		//id�� ���� ���� �Ǽ� ����
		for(String item : id_list) {
			for(int j=0; j<id_list.length; j++) {
				if(id���Ű���.get(item).size()>=k) { //�ǽŰ����� �Ű�Ǽ��� k�̻��̸� ���� ����
					answer[j] += Collections.frequency(id���Ű���.get(item), id_list[j]);
				}
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
