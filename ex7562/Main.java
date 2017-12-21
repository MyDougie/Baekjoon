package ex7562;

/**
 * 나이트의 이동(BFS) - 2017/12/21 - Park Taegyu
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int SIZE;
	static int ans;
	static int[][] dir = {
			{-1,-2},{1,-2},
			{2,1},{2,-1},
			{-1,2},{1,2},
			{-2,1},{-2,-1}
	};
	
	static class Node{
		int x, y, d;
		public Node(int x, int y, int d) {
			this.x = x;
			this.y = y;
			this.d = d;
		}
	}
	
	static int solve(int sx, int sy, int ex, int ey, boolean[][] visited) {
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(sx, sy, 0));
		visited[sx][sy] = true;
		
		while(!q.isEmpty()) {
			Node node = q.poll();
			if(node.x==ex && node.y==ey) {
				ans = node.d;
				break;
			}
			
			for(int i=0; i<dir.length; i++) {
				int nx = node.x + dir[i][0];
				int ny = node.y + dir[i][1];
				
				if(nx<0 || ny<0 || nx>=SIZE || ny>=SIZE) continue;
				if(visited[nx][ny]) continue;
				
				q.offer(new Node(nx, ny, node.d+1));
				visited[nx][ny] = true;
			}
			
		}
		
		return ans;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		int sx, sy, ex, ey;
		while(tc-- > 0) {
			SIZE = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			sx = Integer.parseInt(st.nextToken());
			sy = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			ex = Integer.parseInt(st.nextToken());
			ey = Integer.parseInt(st.nextToken());
			
			System.out.println(solve(sx, sy, ex, ey, new boolean[SIZE][SIZE]));
		}
	}

}
