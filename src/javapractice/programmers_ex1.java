package javapractice;
import java.util.*;

public class programmers_ex1 {
	
    public static double[] solution(int x, int n) {
    	double[] answer = new double[n];
    	
    	for(int i=0; i<n; i++) {
    		answer[i] = x*(i+1);
    	}
    	
    	return answer;
    }

    
    public static void main(String[] args) {
    	double [] res;
    	int x,n;
    	
    	while( true )
    	{
    		Scanner scanner = new Scanner(System.in);
    		
    		System.out.print("x : ");
    		x = scanner.nextInt();
    		System.out.print("n : ");
    		n = scanner.nextInt();
    		
    		res = programmers_ex1.solution(x,n);
    		
    		for(int i=0; i<res.length; i++)
    		{
    			System.out.print(res[i]+" ");
    		}
    		System.out.println();
    	}
    }
}
