package ex10971;

/**
 * DFS(외판원 순회2) - 2017/09/12 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	static int n;
	static int map[][];
	static boolean visited[];
	static int min = Integer.MAX_VALUE;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		map = new int[n+1][n+1];
		visited = new boolean[n+1];
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				map[i][j] = sc.nextInt();
			}
		}
	}
	
	void solve() {
		for(int i=1; i<=n; i++) {
			visited[i] = true;
			dfs(i, i, 0, 0);
			visited[i] = false;
		}
		System.out.println(min);
		
	}
	
	void dfs(int start, int from, int depth, int sum) {
		if(depth == n-1) {
			if(map[from][start]==0) return;//길이 없으면 TSP 불가능
			min = Math.min(min, sum+map[from][start]);
			return;
		}
		
		for(int i=1; i<=n; i++) {
			if(map[from][i] != 0 && !visited[i]) {
				visited[i] = true;
				dfs(start, i, depth+1, sum+map[from][i]);
				visited[i] = false;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		Main main = new Main();
		main.input();
		main.solve();
	}

}
