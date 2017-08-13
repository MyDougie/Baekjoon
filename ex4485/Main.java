package ex4485;

/**
 * 다익스트라(녹색 옷 입은 애가 젤다지?) - 2017/08/14 - Park Taegyu
 * */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int cnt=1;
	static int n;
	static int map[][];
	static int cost[][];
	static int dx[] = {0,1,-1,0};
	static int dy[] = {1,0,0,-1};
	static Queue<Pair> q;
	
	static class Pair{
		int x;
		int y;
		Pair(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	static void bfs() {
		
		while(!q.isEmpty()) {
			Pair p = q.remove();
			
			for(int i=0; i<4; i++) {
				int xx = p.x + dx[i];
				int yy = p.y + dy[i];
				
				if(xx>=0 && yy>=0 && xx<n && yy<n) {
					
					if(cost[xx][yy] > cost[p.x][p.y] + map[xx][yy] ) {
						cost[xx][yy] = cost[p.x][p.y] + map[xx][yy];
						q.add(new Pair(xx,yy));
					}
					
				}
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while((n = sc.nextInt()) != 0) {
			map = new int[n][n];
			cost = new int[n][n];
			
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					map[i][j] = sc.nextInt();
					cost[i][j] = 10000;
				}
			}
			
			q = new LinkedList<>();
			q.add(new Pair(0, 0));
			
			cost[0][0] = map[0][0];
			bfs();
			System.out.println("Problem "+ cnt + ": " + cost[n-1][n-1]);
			cnt++;
			
		}
	}
		
}

