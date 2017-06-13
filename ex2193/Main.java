package ex2193;

import java.util.Scanner;
/**
 * DP(ÀÌÄ£¼ö) - 2017/05/16 - Complete
 * */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long dp [][] = new long[n+1][2];
		
		if(n>=1){
			dp[1][0] = 0;
			dp[1][1] = 1;
		}
		
		if(n>=2){
			dp[2][0] = 1;
			dp[2][1] = 0;
		}
		
		for(int i=3; i<=n; i++){
			dp[i][0] = dp[i-1][0] + dp[i-1][1];
			dp[i][1] = dp[i-1][0];
		}
		
		System.out.println(dp[n][0] + dp[n][1]);
				
	}

}

