package ex14502;

/**
 * 완전탐색(연구소) - 2017/09/06 - Park Taegyu
 * */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	class Pair{
		int x;
		int y;
		Pair(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	static int N,M,ans;
	static int temp[][], map [][];
	static boolean visited[][];
	static List<Pair> virusList;
	
	static final int dx [] = {1, 0, -1, 0};
	static final int dy [] = {0, -1, 0, 1};
	
	int[][] copyMap(int origin[][]) {
		int copy [][] = new int[origin.length][origin[0].length];
		
		for(int i=0; i<N; i++) {
			System.arraycopy(origin[i], 0, copy[i], 0, origin[i].length);
		}
		
		return copy;
	}
	
	void input() {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();	
		map = new int[N][M];
		visited = new boolean[N][M];
		virusList = new ArrayList<>();
		
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				map[i][j] = sc.nextInt();
				if(map[i][j] == 2)	virusList.add(new Pair(i,j));
			}
		}
	}
	
	void process() {
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(map[i][j] == 0) {//벽을 세워라
					dfs(i,j,1);
				}
			}
		}
	}
	
	void dfs(int x, int y, int nWall) {
		map[x][y] = 1;
		visited[x][y] = true;
		
		if(nWall == 3) {
			//bfs를 하고,
			//System.out.println(x + " || " + y);
			temp = copyMap(map);
				
			ans = Math.max(ans, bfs());
			
			map[x][y] = 0;
			visited[x][y] = false;
			return;
		}
		
		for(int i=x; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(map[i][j] != 0 || visited[i][j]) continue;
				dfs(i,j,nWall+1);
			}
		}
		
		map[x][y] = 0;
		visited[x][y] = false;
		
	}
	
	int bfs() {
		int safe = 0;
		Queue<Pair> q = new LinkedList<>();
		for(Pair p : virusList) {
			q.add(p);
		}

		while(!q.isEmpty()) {
			int x = q.peek().x;
			int y = q.remove().y;
			
			for(int i=0; i<4; i++) {
				int xx = x + dx[i];
				int yy = y + dy[i];
				
				if(xx>=0 && yy>=0 && xx<N && yy<M && temp[xx][yy]==0) {
					temp[xx][yy] = 2;
					q.add(new Pair(xx,yy));
				}
			}
			
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(temp[i][j]==0) safe++;
			}
		}
		
		return safe;
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.input();
		main.process();
		System.out.println(ans);

	}
}
