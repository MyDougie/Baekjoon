package ex11724;

/**
 * DFS, BFS(연결요소의 개수) - 2017/09/09 - Park Taegyu
 * */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static int N,M,ans;
	static ArrayList<Queue<Integer>> adjList = new ArrayList<>();
	static boolean visited[];
	static int map[][];
	
	void input() {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();	
		
		for(int i=0; i<=N; i++) {
			adjList.add(new LinkedList<>());
		}
		
		visited = new boolean[N+1];
		map = new int[N+1][N+1];
		
		for(int i=1; i<=M; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			/*
			adjList.get(start).add(end);
			adjList.get(end).add(start);*/
			
			map[start][end] = 1;
			map[end][start] = 1;
			
		}
		
	}
	
	void process() {
		for(int i=1; i<=N; i++) {
			if(!visited[i]) {
				ans++;
				//dfs(i);
				bfs(i);
			}
		}
	}
	
	
	void dfs(int start) {
		visited[start] = true;

		for(int x : adjList.get(start)) {
			if(!visited[x]) {
				visited[x] = true;
				dfs(x);
			}
		}
	}
	
	void bfs(int start) {
		visited[start] = true;
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		
		while(!q.isEmpty()) {
			int x = q.remove();
			
			for(int i=1; i<=N; i++) {
				if(!visited[i] && map[x][i]==1) {
					visited[i] = true;
					q.add(i);
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		Main main = new Main();
		main.input();
		main.process();
		System.out.println(ans);

	}
}