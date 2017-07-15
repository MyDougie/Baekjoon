package ex9095;

/**
 * DP(1,2,3 더하기) - 2017/05/14 - Complete
 * */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++){
			int x = sc.nextInt();
			
			int dp [] = new int[x+1];
			dp[0] = 1;
			
			if(x>=1) dp[1] = 1;
			if(x>=2) dp[2] = 2;
			
			for(int j=3; j<=x; j++){
				dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
			}
			System.out.println(dp[x]);
			
		}
	}

}
