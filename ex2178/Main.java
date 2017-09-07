package ex2178;

/**
 * BFS(미로탐색) - 2017/09/08 - Park Taegyu
 * */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int N,M;
	static int map[][];
	static boolean visited[][];
	static int dx [] = {-1, 0, 1, 0};
	static int dy [] = {0, 1, 0, -1};
	static int min;
	
	class Pair{
		int x;
		int y;
		int breath;
		Pair(int x, int y, int breath){
			this.x = x;
			this.y = y;
			this.breath = breath;
		}
	}
	
	void input() {
		Scanner sc = new Scanner(System.in);
		String input[] = sc.nextLine().split(" ");
		
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		
		map = new int[N+1][M+1];
		visited = new boolean[N+1][M+1];
		for(int i=1; i<=N; i++) {
			String str [] = sc.nextLine().split("");
			for(int j=0; j<str.length; j++) {
				map[i][j+1] = Integer.parseInt(str[j]);
			}
		}
		min = N*M;
	}
	
	void solve() {
		bfs(1,1,1);
	}
	
	void bfs(int x, int y, int breath) {
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(x,y, breath));
		visited[x][y] = true;
		
		while(!q.isEmpty()) {
			Pair p = q.remove();
			visited[p.x][p.y] = true;
			
			if(p.x==N && p.y==M) {
				System.out.println(p.breath);
				return;
			}
			
			for(int i=0; i<4; i++) {
				int nextX = p.x + dx[i];
				int nextY = p.y + dy[i];
				
				//if(nextX<1 || nextY<1 || nextX>N || nextY>M || map[nextX][nextY]==0 || visited[nextX][nextY]) continue;
				
				if(nextX>=1 && nextY>=1 && nextX<=N && nextY<=M && map[nextX][nextY]==1 && !visited[nextX][nextY]) {
					map[nextX][nextY] = 0;
					visited[nextX][nextY] = true;
					q.add(new Pair(nextX, nextY, p.breath+1));
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.input();
		main.solve();
	}

}
