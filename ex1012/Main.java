package ex1012;

/**
 * BFS(유기농 배추) - 2017/09/08 - Park Taegyu
 * */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int row,col;
	static int map[][];
	static boolean visited[][];
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
	
	void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int ans = 0;
			row = sc.nextInt();
			col = sc.nextInt();
			
			map = new int[row][col];
			visited = new boolean[row][col];
			
			int m = sc.nextInt();
			for(int j=0; j<m; j++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				
				map[x][y] = 1;
			}
			
			for(int j=0; j<row; j++) {
				for(int k=0; k<col; k++) {
					if(map[j][k] == 1 && !visited[j][k]) {
						ans++;
						bfs(j,k);
					}
				}
			}
			
			System.out.println(ans);
			
			ans = 0;
			map = null;
			visited = null;
			
		}
		
	}
	
	void bfs(int x, int y) {
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(x, y));
		visited[x][y] = true;
		
		while(!q.isEmpty()) {
			Pair p = q.remove();
			
			for(int i=0; i<4; i++) {
				int nextX = p.x + dx[i];
				int nextY = p.y + dy[i];
				
				if(nextX>=0 && nextY>=0 && nextX<row && nextY<col && map[nextX][nextY]==1 && !visited[nextX][nextY]) {
					visited[nextX][nextY] = true;
					q.add(new Pair(nextX, nextY));
				}
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

}
