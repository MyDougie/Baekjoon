package ex2293;

/**
 * DP(동전1) - 2017/09/03 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int dp [] = new int [k+1];
		int coins [] = new int [n];
		dp[0] = 1;
		 
		for(int i=0; i<coins.length; i++) {
			coins[i] = sc.nextInt();
		}
		
		for(int i=0; i<coins.length; i++) {
			for(int j=coins[i]; j<=k; j++) {
				dp[j] += dp[j - coins[i]];
			} 
		}
	
		System.out.println(dp[k]);
	}
}
