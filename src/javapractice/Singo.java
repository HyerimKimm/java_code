//https://programmers.co.kr/learn/courses/30/lessons/92334
//�����ε�.... ���� �֤�����...���� ã�� .. .

package javapractice;
import java.util.*;

public class Singo {
	public static int[] solution(String[] id_list, String[] report, int k) {
		int[] id����ȿ�ѽŰ�Ǽ�= new int[id_list.length]; //id�� ��ȿ�� �Ű���� ����
		int[] id���Ű����Ƚ�� = new int[id_list.length];
		Arrays.fill(id���Ű����Ƚ��, 0);
		Arrays.fill(id����ȿ�ѽŰ�Ǽ�, 0);
		ArrayList<String> ��������� = new ArrayList<String>();
		
		String [] �Ű��� = new String[report.length];
		String [] �ǽŰ��� = new String[report.length];
		String �ڸ����;
		
		//�Ű��ڸ� ����, �ߺ� �Ⱦ���
		for(int i=0; i<report.length; i++) {
			�ڸ���� = report[i];
			String [] �ڸ���� = �ڸ����.split("\\s");
			�Ű���[i] = �ڸ����[0];
		}
		
		//�ǽŰ��ڸ� ����, �ߺ� �Ⱦ���
		for(int i=0; i<report.length; i++) {
			�ڸ����=report[i];
			String [] �ڸ���� = �ڸ����.split("\\s");
			�ǽŰ���[i] = �ڸ����[1];
		}
		
		//id�� �Ű���� Ƚ�� ����
		for(int i=0; i<�ǽŰ���.length; i++) {
			for(int j=0; j<id_list.length; j++) {
				if(�ǽŰ���[i].equals(id_list[j])) {
					id���Ű����Ƚ��[j] += 1;
				}
			}
		}
		
		//���� ������ ���� ����
		for(int i=0; i<id_list.length;i++) {
			if(id���Ű����Ƚ��[i]>=k) {
				���������.add(id_list[i]);
			}
		}
		
		for(int i=0; i<id_list.length; i++) {
			for(int j=0; j<�Ű���.length; j++) {
				if(id_list[i].equals(�Ű���[j]) && ���������.contains(�ǽŰ���[j])) {
					id����ȿ�ѽŰ�Ǽ�[i]+=1;
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
