package ex2098;

/**
 * TSP(외판원 순회) - 2017/11/07 - Park Taegyu
 * */
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int n;
	static int[][] map;
	static int[][] dp;
	static final int INF = 1000000000;
	
	static int tsp(int start, int visited) {
		if(visited == (1<<n) - 1) {//모든 정점을 방문한 경우
			return map[start][0];
		}
		
		if(dp[start][visited] != INF) {//이미 방문한 경로
			return dp[start][visited];
		}
		
		for(int next=0; next<n; next++) {
			if((visited & (1<<next)) == 0 && map[start][next]!=0) {
				dp[start][visited] = Math.min(dp[start][visited], map[start][next] + tsp(next, visited | (1<<next)));
			}
		}
		
		return dp[start][visited];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		dp = new int[n][1<<n];
		map = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				map[i][j] = sc.nextInt();
			}
			Arrays.fill(dp[i], INF);
		}
		
		System.out.println(tsp(0,1));
	}

}
