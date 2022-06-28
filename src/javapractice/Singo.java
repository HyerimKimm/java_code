//https://programmers.co.kr/learn/courses/30/lessons/92334
//문제인데.... 오류 있ㅇㄹ흠...내일 찾자 .. .

package javapractice;
import java.util.*;

public class Singo {
	public static int[] solution(String[] id_list, String[] report, int k) {
		int[] id별유효한신고건수= new int[id_list.length]; //id별 유효한 신고건의 갯수
		int[] id별신고당한횟수 = new int[id_list.length];
		ArrayList<String> report리스트 = new ArrayList<String>();
		ArrayList<String> 중복제거report = new ArrayList<String>();
		ArrayList<String> 신고자 = new ArrayList<String>();
		ArrayList<String> 피신고자 = new ArrayList<String>();
		ArrayList<String> 리얼범죄자 = new ArrayList<String>();
		String[] 자른결과 = new String[2];
		
		Arrays.fill(id별신고당한횟수, 0);
		Arrays.fill(id별유효한신고건수, 0);

		//report를 arrayList로 옮김
		for(int i=0; i<report.length; i++) {
			report리스트.add(report[i]);
		}
		
		//중복 제거한 report리스트 저장
		for(String item:report리스트) {
			if(!중복제거report.contains(item)) 중복제거report.add(item);
		}
		
		//신고자, 피신고자 저장
		for(String item:중복제거report) {
			자른결과 = item.split("\\s");
			신고자.add(자른결과[0]);
			피신고자.add(자른결과[1]);
		}
		
		//id별 신고당한 횟수 저장
		for(String item:피신고자) {
			for(int i=0; i<id_list.length; i++) {
				if(item.equals(id_list[i])) id별신고당한횟수[i]+=1;
			}
		}
		
		//리얼 범죄자 정보 저장
		for(int i=0;i<id_list.length;i++) {
			if(id별신고당한횟수[i]>k) 리얼범죄자.add(id_list[i]);
		}
		
		//id별 유효한 신고건수 저장
		for(int i=0; i<id_list.length; i++) {
			for(String 신고자item:신고자) {
				for(String 피신고자item:피신고자) {
					if(id_list[i].equals(신고자item) && 리얼범죄자.contains(피신고자item))id별유효한신고건수[i]+=1;
				}
			}
		}
		
		return id별유효한신고건수;
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
