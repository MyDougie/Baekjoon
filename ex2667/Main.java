package ex2667;

/**
 * BFS(단지번호 붙이기) - 2017/09/08 - Park Taegyu
 * */
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int N;
	static int map[][];
	static boolean visited[][];
	static int dx [] = {-1, 0, 1, 0};
	static int dy [] = {0, 1, 0, -1};
	static int ans;
	static List<Integer> result = new ArrayList<>();
	
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
		N = Integer.parseInt(sc.nextLine());
		
		map = new int[N][N];
		visited = new boolean[N][N];
		
		for(int i=0; i<N; i++) {
			String input [] = sc.nextLine().split("");
			for(int j=0; j<input.length; j++) {
				map[i][j] = Integer.parseInt(input[j]);
			}
		}
		
		for(int j=0; j<N; j++) {
			for(int k=0; k<N; k++) {
				if(map[j][k] == 1 && !visited[j][k]) {
					ans++;
					bfs(j,k);
				}
			}
		}
		
		System.out.println(ans);
		Collections.sort(result);
		for(int re : result) {
			System.out.println(re);
		}
		
	}
	
	void bfs(int x, int y) {
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(x, y));
		visited[x][y] = true;
		
		int cnt = 0;
		while(!q.isEmpty()) {
			Pair p = q.remove();
			cnt++;
			for(int i=0; i<4; i++) {
				int nextX = p.x + dx[i];
				int nextY = p.y + dy[i];
				
				if(nextX>=0 && nextY>=0 && nextX<N && nextY<N && map[nextX][nextY]==1 && !visited[nextX][nextY]) {
					visited[nextX][nextY] = true;
					q.add(new Pair(nextX, nextY));
				}
			}
		}
		result.add(cnt);
		
	}
	
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

}
