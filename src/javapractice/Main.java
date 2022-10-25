package javapractice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static int solution(int[] array, int n) {
        int cnt=0;
        
        for(int i=0; i<array.length; i++){
            if(array[i]==n) cnt++;
        }
        
        return cnt;
    }
	
    public static void main(String[] args) {
    	int [] array = {0,2,3,4};
    	int answer = solution(array, 1);
    	System.out.print(answer);
    }
}