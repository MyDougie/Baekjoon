package ex14500;

/**
 * DFS(테트로미노) - 2017/10/15 - Park Taegyu
 * */
import java.util.*;

public class Main {
	
	static int n, m, ans;
	static int[][] map;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	static boolean[][] visited;
	
	void process() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		map = new int[n][m];
		visited = new boolean[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				visited[i][j] = true;
				dfs(i,j,1,map[i][j]);
				visited[i][j] = false;
				exception(i,j,map[i][j]);
			}
		}
		System.out.println(ans);
	}
	
	void dfs(int x, int y, int depth, int sum) {
		if(depth == 4) {
			ans = Math.max(ans, sum);
			return;
		}
		
		for(int i=0; i<4; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			
			if(nextX<0 || nextY<0 || nextX>=n || nextY>=m || visited[nextX][nextY]) continue;
			
			visited[nextX][nextY] = true;
			dfs(nextX, nextY, depth+1, sum + map[nextX][nextY]);
			visited[nextX][nextY] = false;
		}
	}
	
	void exception(int x, int y, int sum) {//i-1,j   i,j+1,  i+1,j   i,j-1
		if(x-1>=0 && y-1>=0 && y+1<m) {
			ans = Math.max(ans, sum + map[x-1][y] + map[x][y-1] + map[x][y+1]); 
		}
		if(x-1>=0 && x+1<n && y+1<m) {
			ans = Math.max(ans, sum + map[x-1][y] + map[x+1][y] + map[x][y+1]); 
		}
		if(x+1<n && y-1>=0 && y+1<m) {
			ans = Math.max(ans, sum + map[x+1][y] + map[x][y-1] + map[x][y+1]); 
		}
		if(x-1>=0 && y-1>=0 && x+1<n) {
			ans = Math.max(ans, sum + map[x-1][y] + map[x][y-1] + map[x+1][y]); 
		}
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.process();
	}

}
