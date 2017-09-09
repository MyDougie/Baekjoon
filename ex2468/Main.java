package ex2468;

/**
 * DFS, BFS(안전 영역) - 2017/09/09 - Park Taegyu
 * */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int N;
	static int maxHeight, minHeight;
	static int map[][];
	static boolean visited[][];
	static int ans=1;
	static int dx [] = {-1, 0, 1, 0};
	static int dy [] = {0, 1, 0, -1};
	
	class Pair{
		int x;
		int y;
		Pair(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	void input() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		map = new int[N][N];
		visited = new boolean[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				map[i][j] = sc.nextInt();
				maxHeight = Math.max(maxHeight, map[i][j]);
				minHeight = Math.min(minHeight, map[i][j]);
			}
		}
	}
	
	void solve1() {
		for(int i=minHeight; i<=maxHeight; i++) {
			initVisit(i);
			int cnt = 0;
			for(int j=0; j<N; j++) {
				for(int k=0; k<N; k++) {
					if(!visited[j][k]) {
						cnt++;
						bfs(j,k);
					}
				}
			}
			ans = Math.max(ans, cnt);
		}
		System.out.println(ans);
	}
	
	void bfs(int x, int y) {
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(x,y));
		visited[x][y] = true;
		
		while(!q.isEmpty()) {
			Pair p = q.remove();
			
			for(int i=0; i<4; i++) {
				int nextX = p.x + dx[i];
				int nextY = p.y + dy[i];
				
				if(nextX>=0 && nextY>=0 && nextX<N && nextY<N && !visited[nextX][nextY]) {
					visited[nextX][nextY] = true;
					q.add(new Pair(nextX, nextY));
				}
			}
		}
		
	}
	
	void solve2() {
		for(int i=minHeight; i<=maxHeight; i++) {
			int cnt = 0;
			initVisit();
			for(int j=0; j<N; j++) {
				for(int k=0; k<N; k++) {
					if(map[j][k]>i && !visited[j][k]) {
						cnt++;
						dfs(j,k,i);
					}
				}
			}
			ans = Math.max(ans, cnt);
		}
		System.out.println(ans);
	}
	
	void dfs(int x, int y, int height) {
		visited[x][y] = true;
		
		for(int i=0; i<4; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			
			if(nextX>=0 && nextY>=0 && nextX<N && nextY<N && !visited[nextX][nextY] && map[nextX][nextY]>height) {
				visited[nextX][nextY] = true;
				dfs(nextX, nextY, height);
			}
			
		}
	}
	
	
	void initVisit(int height) {
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				visited[i][j] = false;
				if(map[i][j] <= height) {
					visited[i][j] = true;
				}
			}
		}
	}
	
	void initVisit() {
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				visited[i][j] = false;
			}
		}
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.input();
		main.solve1();
		//main.solve2();
	}

}
