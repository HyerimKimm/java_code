package javapractice;

public class googoo {
	public static void main(String[] args) {
		int x,y;
		for(x=1;x<=9;x++){
			for(y=1;y<=9;y++) {
				System.out.print(x + "*" + y +"=" + x*y +"\t");
			}
			System.out.print("\n");
		}
	}
}
