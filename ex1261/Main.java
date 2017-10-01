package ex1261;

/**
 * 다익스트라(알고스팟) - 2017/10/02 - Park Taegyu 
 * */
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static int n, m, ans;
	static int [][] map = new int[101][101];
	static int [][] dist = new int[101][101];
//	static boolean [][] visited = new boolean[101][101];
	static int dx [] = {-1,0,1,0};
	static int dy [] = {0,1,0,-1};
	static final int INF = 1000000;
	
	static {
		for(int i=1; i<=100; i++) {
			Arrays.fill(dist[i], INF);
		}
	}
	
	class Pair implements Comparable<Pair>{
		int x,y,crash;
		Pair(int x, int y, int crash){
			this.x = x;
			this.y = y;
			this.crash = crash;
		}
		
		@Override
		public int compareTo(Pair o) {
			return this.crash < o.crash ? -1 : 1;
		}
	}
	
	void process() {
		input();
		solve();
	}

	void input() {
		Scanner sc = new Scanner(System.in);
		String s [] = sc.nextLine().split(" ");
		m = Integer.parseInt(s[0]);
		n = Integer.parseInt(s[1]);
		ans = n+m;
		
		for(int i=1; i<=n; i++) {
			String str = sc.nextLine();
			for(int j=1; j<=str.length(); j++) {
				map[i][j] = str.charAt(j-1) - '0';
			}
		}
		
	}
	
	void solve() {
		dijkstra(1,1);
	}
	
	void dijkstra(int row, int col) {
		PriorityQueue<Pair> q = new PriorityQueue<>();
		q.add(new Pair(row, col, 0));
		dist[row][col] = 0;
//		visited[row][col] = true;

		while (!q.isEmpty()) {
			Pair p = q.remove();
//			visited[p.x][p.y] = true;
			
			if(p.x == n && p.y ==m) {
				System.out.println(p.crash);
				return;
			}
			
			if(dist[p.x][p.y] < p.crash) {
				continue;
			}

			for (int i = 0; i < 4; i++) {
				int xx = p.x + dx[i];
				int yy = p.y + dy[i];

				if (xx < 1 || yy < 1 || xx > n || yy > m /*|| visited[xx][yy]*/) continue;
			
				if (dist[xx][yy] > dist[p.x][p.y] + map[xx][yy]) {
					dist[xx][yy] = dist[p.x][p.y] + map[xx][yy];
					q.add(new Pair(xx, yy, dist[xx][yy]));
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.process();
	}

}
