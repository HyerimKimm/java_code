//https://programmers.co.kr/learn/courses/30/lessons/92334
//�����ε�.... ���� �֤�����...���� ã�� .. .

package javapractice;
import java.util.*;

public class Singo {
	public static int[] solution(String[] id_list, String[] report, int k) {
		int[] id����ȿ�ѽŰ�Ǽ�= new int[id_list.length]; //id�� ��ȿ�� �Ű���� ����
		int[] id���Ű����Ƚ�� = new int[id_list.length];
		ArrayList<String> report����Ʈ = new ArrayList<String>();
		ArrayList<String> �ߺ�����report = new ArrayList<String>();
		ArrayList<String> �Ű��� = new ArrayList<String>();
		ArrayList<String> �ǽŰ��� = new ArrayList<String>();
		ArrayList<String> ��������� = new ArrayList<String>();
		String[] �ڸ���� = new String[2];
		
		Arrays.fill(id���Ű����Ƚ��, 0);
		Arrays.fill(id����ȿ�ѽŰ�Ǽ�, 0);

		//report�� arrayList�� �ű�
		for(int i=0; i<report.length; i++) {
			report����Ʈ.add(report[i]);
		}
		
		//�ߺ� ������ report����Ʈ ����
		for(String item:report����Ʈ) {
			if(!�ߺ�����report.contains(item)) �ߺ�����report.add(item);
		}
		
		//�Ű���, �ǽŰ��� ����
		for(String item:�ߺ�����report) {
			�ڸ���� = item.split("\\s");
			�Ű���.add(�ڸ����[0]);
			�ǽŰ���.add(�ڸ����[1]);
		}
		
		//id�� �Ű���� Ƚ�� ����
		for(String item:�ǽŰ���) {
			for(int i=0; i<id_list.length; i++) {
				if(item.equals(id_list[i])) id���Ű����Ƚ��[i]+=1;
			}
		}
		
		//���� ������ ���� ����
		for(int i=0;i<id_list.length;i++) {
			if(id���Ű����Ƚ��[i]>k) ���������.add(id_list[i]);
		}
		
		//id�� ��ȿ�� �Ű�Ǽ� ����
		for(int i=0; i<id_list.length; i++) {
			for(String �Ű���item:�Ű���) {
				for(String �ǽŰ���item:�ǽŰ���) {
					if(id_list[i].equals(�Ű���item) && ���������.contains(�ǽŰ���item))id����ȿ�ѽŰ�Ǽ�[i]+=1;
				}
			}
		}
		
		return id����ȿ�ѽŰ�Ǽ�;
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
