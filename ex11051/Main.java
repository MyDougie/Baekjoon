package ex11051;

/**
 * 이항 계수 2 - 2017/12/12 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		k = Math.min(k, n-k);
		
		int[][] dp = new int[n+1][n+1];
		
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				if(j==0 || i==j) {
					dp[i][j] = 1;
				}else if(j==1) {
					dp[i][j] = i;
				}
			}
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i>j) {
					dp[i][j] = (dp[i-1][j-1] + dp[i-1][j]) % 10007;
				}
			}
		}
		
		System.out.println(dp[n][k]);
	}

}
