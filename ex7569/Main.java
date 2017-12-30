package ex7569;

/**
 * 토마토(BFS) - 2017/12/30 - Park Taegyu
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int m, n, h;
	static int[][][] map;
	static boolean visited[][][];
	static int result;
	static Queue<Node> q = new LinkedList<>();
	static int[][] dir = {
			{0,0,1},
			{0,0,-1},
			{0,1,0},
			{0,-1,0},
			{1,0,0},
			{-1,0,0}
	};
	
	static class Node{
		int x, y, z, cnt;
		public Node(int x, int y, int z, int cnt) {
			this.x = x;
			this.y = y;
			this.z = z;
			this.cnt = cnt;
		}
	}
	
	
	public static void bfs() {
		
		while(!q.isEmpty()) {
			Node node = q.poll();
			result = node.cnt;
			
			for(int i=0; i<dir.length; i++) {
				int nx = node.x + dir[i][0];
				int ny = node.y + dir[i][1];
				int nz = node.z + dir[i][2];
				
				if(nx<0 || ny<0 || nz<0 || nx>=m || ny>=n || nz>=h) continue;
				if(visited[nx][ny][nz]) continue;
				if(map[nx][ny][nz] == -1) continue;
				
				map[nx][ny][nz] = 1;
				visited[nx][ny][nz] = true;
				q.add(new Node(nx, ny, nz, node.cnt+1));
			}
		}
	}
	
	public static void printResult() {
		for(int i=0; i<h; i++) {
			for(int j=0; j<n; j++) {
				for(int k=0; k<m; k++) {
					if(map[k][j][i] == 0) {
						result = -1;
					}
				}
			}
		}
		System.out.println(result);
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		
		map = new int[m][n][h];
		visited = new boolean[m][n][h];
		
		for(int i=0; i<h; i++) {
			for(int j=0; j<n; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				for(int k=0; k<m; k++) {
					int x = Integer.parseInt(st.nextToken());
					map[k][j][i] = x;
					if(x == 1) {
						q.add(new Node(k, j, i, 0));
						visited[k][j][i] = true;
					}
				}
			}
		}
		
		bfs();
		
		printResult();
	}
}
