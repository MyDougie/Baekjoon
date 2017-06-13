package ex1463;

import java.util.Scanner;
/**
 * DP(1로 만들기) - 2017/04/06 - Complete
 * */

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		
		int result [] = new int [n+1];
		result[1] = 0;
		
		for(int i=2; i <= n ; i++){
			result[i] = result[i-1] + 1;
			if( i%2 == 0){
				result[i] = Math.min(result[i], result[i/2]+1);
			}
			if( i%3 == 0){
				result[i] = Math.min(result[i], result[i/3]+1);
			}
		}		
		System.out.println(result[n]);
	
	}
}
