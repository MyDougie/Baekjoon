package ex14501;

/**
 * DP, DFS(퇴사) - 2017/09/06 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {
	
	static int n;
	static int t[], p[];
	static int dp [];
	static int max;
	
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
	
	
	void solve1() {
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
	
	void solve2() {
		dfs(1,0);
		System.out.println(max);
	}
	
	void dfs(int day, int sum) {
		if(day == n+1) {
			System.out.println("sum : " + sum);
			max = Math.max(max, sum);
			return;
		}
		
		if(day + t[day] <= n+1) dfs(day + t[day], sum + p[day]);
		if(day + 1 <= n+1) dfs(day+1, sum);
		
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.input();
		//main.solve1();
		main.solve2();
	}
}
