package ex14501;

/**
 * DP(퇴사) - 2017/09/06 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {
	
	static int n;
	static int t[], p[];
	static int dp [];
	
	void input() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		dp = new int [n+1];
		t = new int[n+1];
		p = new int[n+1];
		for(int i=1; i<=n; i++) {
			t[i] = sc.nextInt();
			p[i] = sc.nextInt();
			dp[i] = p[i];
		}	
	}
	
	
	void solve() {
		for(int i=2; i<=n; i++) {
			for(int j=1; j<i; j++) {
				if(i-j >= t[j]) {
					dp[i] = Math.max(dp[i], dp[j] + p[i]);
				}
			}
		}
		
		int max = 0;
		for(int i=1; i<=n; i++) {
			if(i-1 + t[i] <= n) {
				max = Math.max(max, dp[i]);
			}
		}
		System.out.println(max);
		
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.input();
		main.solve();
	}
}
