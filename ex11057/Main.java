package ex11057;

/**
 * DP(오르막 수) - 2017/05/14 - Complete
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dp [][] = new int[1001][10];
		long result = 0;
		
		for(int i=0; i<10; i++)
			dp[1][i] = 1;
		
		for(int i=2; i<=n; i++){
			for(int j=0; j<10; j++){
				for(int k=0; k<=j; k++){
					dp[i][j] += (dp[i-1][k]) % 10007;
				}
			}
		}	

		for(int i=0; i<10; i++)
			result += dp[n][i];
		result %= 10007;
		System.out.println(result);
	}

}