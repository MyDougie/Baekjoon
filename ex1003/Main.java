package ex1003;

import java.util.Scanner;
/**
 *  fibonacci - 2017/04/06 - Complete
 * */
public class Main {
	static int result [] = new int[2];
	public static int fibonacci(int n) {
	    if (n==0) {
	    	//System.out.print(0);
	    	result[0]++;
	        return 0;
	    } else if (n==1) {
	    //	System.out.print(1);
	    	result[1]++;
	        return 1;
	    } else {
	        return fibonacci(n-1) + fibonacci(n-2);
	    }
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = Integer.parseInt(input.nextLine());
		
		for(int i=0; i<n; i++){
			int x = Integer.parseInt(input.nextLine());
			fibonacci(x);
			System.out.println(result[0] + " " + result[1]);
			result[0]=0;
			result[1]=0;
		}
		
	}
}