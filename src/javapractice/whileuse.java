package javapractice;
import java.util.*;

//입력한 정수의 평균을 계산하는 프로그램
public class whileuse {
	public static void main(String[] args) {
		int cnt=0, num=0, sum=0;
		double avg=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요.");
		while((num=scanner.nextInt())!=0) {
			sum+=num;
			cnt+=1;
		}
		avg=(double)sum/(double)cnt;
		System.out.println("수의 개수는 "+cnt+"이며");
		System.out.println("평균은 "+avg+"입니다.");
	}
}