package ex11052;

/**
 * DP(붕어빵 판매하기) - 2017/09/07 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	static int N;
	static int p[];
	static int dp[];
	
	void input() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		p = new int [N+1];
		dp = new int [N+1];
		
		for(int i=1; i<p.length; i++) {
			p[i] = sc.nextInt();
		}
		
	}
	
	void solve() {
		dp[1] = p[1];
		//dp[n] : 붕어빵 n개를 팔 떄 얻을 수 있는 최대 수익
		for(int i=2; i<=N; i++) {
			for(int j=1; j<=i; j++) {
				dp[i] = Math.max(dp[i], dp[i-j] + p[j]);
			}
		}
		
		System.out.println(dp[N]);
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.input();
		main.solve();
	}

}
