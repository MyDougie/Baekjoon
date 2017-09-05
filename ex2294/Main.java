package ex2294;

/**
 * DP(동전2) - 2017/09/05 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int dp [] = new int [k+1];
		int coins [] = new int [n];
		for(int i=0; i<n; i++) {
			coins[i] = sc.nextInt();
		}
		
		for(int i=1; i<=k; i++) {
			dp[i] = 10001;
		}

		
		for(int i=0; i<n; i++) {
			for(int j=coins[i]; j<=k; j++) {
				dp[j] = Math.min(dp[j], dp[j-coins[i]]+1);
			}
		}
		
		if(dp[k] == 10001) {
			dp[k] = -1;
		}
		
		System.out.println(dp[k]);
		
	}
}
