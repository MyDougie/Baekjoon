package ex1916;

/**
 * BFS(토마토) - 2017/10/27 - Park Taegyu
 * */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int m, n;
	static int[][] map;
	static boolean[][] visited;
	static int ans;
	static Queue<Pair> q = new LinkedList<>();
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	
	static class Pair{
		int x, y, breath;
		Pair(int x, int y, int breath){
			this.x = x;
			this.y = y;
			this.breath = breath;
		}
	}
	
	static void bfs() {
		while(!q.isEmpty()) {
			Pair p = q.poll();
			ans = p.breath;
			
			for(int i=0; i<4; i++) {
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				
				if(nx<0 || ny<0 || nx>=n || ny>=m) continue;
				if(visited[nx][ny]) continue;
				
				if(map[nx][ny]==0) {
					visited[nx][ny] = true;
					q.add(new Pair(nx, ny, p.breath+1));
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		map = new int[n][m];
		visited = new boolean[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				map[i][j] = sc.nextInt();
				if(map[i][j]==1) {
					visited[i][j] = true;
					q.add(new Pair(i, j, 0));
				}
			}
		}
		
		bfs();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(!visited[i][j] && map[i][j]==0) {
					ans = -1;
				}
			}
		}
		System.out.println(ans);
	}

}
