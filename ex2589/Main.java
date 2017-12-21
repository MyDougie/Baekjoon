package ex2589;

/**
 * 보물섬(BFS) - 2017/12/21 - Park Taegyu
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int n, m;
	static int sx, sy;
	static int ans;
	
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static char[][] map;
	static boolean[][] visited;
	
	static class Node{
		int x, y, d;
		public Node(int x, int y, int d) {
			this.x = x;
			this.y = y;
			this.d = d;
		}
	}
	
	static int solve() {
		int val; 
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(map[i][j]=='L') {
					visited = new boolean[n][m];
					val = bfs(i, j);
					ans = Math.max(ans, val);
				}
			}
		}
		return ans;
	}
	
	static int bfs(int x, int y) {
		int max = 0;
		Queue<Node> q = new LinkedList<>();
		q.offer(new Node(x, y, 0));
		visited[x][y] = true;

		while(!q.isEmpty()) {
			Node node = q.poll();
			
			if(max < node.d) {
				max = node.d;
				sx = node.x;
				sy = node.y;
			}
			
			for(int i=0; i<4; i++) {
				int nx = node.x + dx[i];
				int ny = node.y + dy[i];
				
				if(nx>=0 && ny>=0 && nx<n && ny<m && !visited[nx][ny] && map[nx][ny]=='L') {
					q.offer(new Node(nx, ny, node.d+1));
					visited[nx][ny] = true;
				}
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new char[n][m];
		visited = new boolean[n][m];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			String input[] = st.nextToken().split("");
			for(int j=0; j<input.length; j++) {
				map[i][j] = input[j].charAt(0);
			}
			
		}
		
		System.out.println(solve());
	}

}
