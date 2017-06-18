package ex2579;
/**
 * DP(계단오르기) - 2017/05/17 - Complete
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		long dp[][] = new long[n+1][3];
		
		for(int i=1; i<=n; i++){
			dp[i][0] = input.nextInt();
		}
		dp[0][1] = dp[0][2] = dp[0][0];
		
		dp[1][1] = dp[1][0];
		
		dp[2][1] = dp[2][0] + dp[1][0];
		dp[2][2] = dp[2][0];
		
		for(int i=3; i<=n; i++){
			dp[i][1] = dp[i][0] + dp[i-1][2];
			dp[i][2] = dp[i][0] + Math.max(dp[i-2][1], dp[i-2][2]);
		}
		
		System.out.println(Math.max(dp[n][0],Math.max(dp[n][1], dp[n][2])));
		
	}

}