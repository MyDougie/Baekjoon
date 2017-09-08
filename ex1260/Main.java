package ex1260;

/**
 * DFS와 BFS - 2017/09/08 - Park Taegyu
 * */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int N,M,V;
	static int map[][];
	static boolean visited[];
	
	void input(){
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		V = sc.nextInt();
		
		map = new int [N+1][N+1];
		visited = new boolean[N+1];
		
		for(int i=1; i<=M; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			map[start][end] = 1;
			map[end][start] = 1;
		}
		
	}
	
	void solve() {
		dfs(V);
		System.out.println();
		initVisit();
		bfs(V);
	}
	
	void initVisit() {
		for(int i=0; i<visited.length; i++) {
			visited[i] = false;
		}
	}
	
	void dfs(int start) {
		System.out.print(start+" ");
		visited[start] = true;
			
		for(int i=1; i<=N; i++) {
			if(map[start][i] == 1 && !visited[i]) {
				dfs(i);
			}
		}
		
	}
	
	void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		visited[start] = true;
		
		while(!q.isEmpty()) {
			int front = q.remove();
			System.out.print(front + " ");
			
			for(int i=1; i<=N; i++) {
				if(map[front][i] == 1 && !visited[i]) {
					q.add(i);
					visited[i] = true;
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
