//https://programmers.co.kr/learn/courses/30/lessons/92334
//문제인데.... 오류 있ㅇㄹ흠...내일 찾자 .. .

package javapractice;
import java.util.*;

public class Singo {
	public static int[] solution(String[] id_list, String[] report, int k) {
		int[] id별유효한신고건수= new int[id_list.length]; //id별 유효한 신고건의 갯수
		int[] id별신고당한횟수 = new int[id_list.length];
		Arrays.fill(id별신고당한횟수, 0);
		Arrays.fill(id별유효한신고건수, 0);
		ArrayList<String> 리얼범죄자 = new ArrayList<String>();
		
		String [] 신고자 = new String[report.length];
		String [] 피신고자 = new String[report.length];
		String 자르기용;
		
		//신고자만 저장, 중복 안없앰
		for(int i=0; i<report.length; i++) {
			자르기용 = report[i];
			String [] 자른결과 = 자르기용.split("\\s");
			신고자[i] = 자른결과[0];
		}
		
		//피신고자만 저장, 중복 안없앰
		for(int i=0; i<report.length; i++) {
			자르기용=report[i];
			String [] 자른결과 = 자르기용.split("\\s");
			피신고자[i] = 자른결과[1];
		}
		
		//id별 신고당한 횟수 저장
		for(int i=0; i<피신고자.length; i++) {
			for(int j=0; j<id_list.length; j++) {
				if(피신고자[i].equals(id_list[j])) {
					id별신고당한횟수[j] += 1;
				}
			}
		}
		
		//리얼 범죄자 정보 저장
		for(int i=0; i<id_list.length;i++) {
			if(id별신고당한횟수[i]>=k) {
				리얼범죄자.add(id_list[i]);
			}
		}
		
		for(int i=0; i<id_list.length; i++) {
			for(int j=0; j<신고자.length; j++) {
				if(id_list[i].equals(신고자[j]) && 리얼범죄자.contains(피신고자[j])) {
					id별유효한신고건수[i]+=1;
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
