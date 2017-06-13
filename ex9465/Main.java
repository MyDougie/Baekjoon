package ex9465;

import java.util.Scanner;
/**
 * DP(½ºÆ¼Ä¿) - 2017/06/06 - Complete
 * */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++){
			int m = sc.nextInt();
			int arr[][] = new int[2][m];
			int dp[][] = new int[2][m];
			
			for(int j=0; j<2; j++){
				for(int k=0; k<m; k++){
					arr[j][k] = sc.nextInt();
				}
			}
			
			dp[0][0] = arr[0][0];
			dp[1][0] = arr[1][0];
			
			if(m>=2){
				dp[0][1] = arr[1][0] + arr[0][1];
				dp[1][1] = arr[0][0] + arr[1][1];
			}

			for (int j = 2; j < m; j++) {
				dp[0][j] = Math.max(dp[1][j-1], Math.max(dp[0][j - 2] + arr[1][j - 1], dp[1][j - 2])) + arr[0][j];
				dp[1][j] = Math.max(dp[0][j-1], Math.max(dp[1][j - 2] + arr[0][j - 1], dp[0][j - 2])) + arr[1][j];
			}
			
			System.out.println(Math.max(dp[0][m-1], dp[1][m-1]));
			
		}
	}

}
