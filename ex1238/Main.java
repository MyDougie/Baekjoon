package ex1238;

/**
 * 다익스트라, 플로이드 와샬(파티) - 2017/08/27 - Park Taegyu
 * */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/*
class Pair{
	int x;
	int y;
	Pair(int x, int y){
		this.x = x;
		this.y = y;
	}
}
*/

public class Main {
	static int n,x;
	static int map [][];
	static int revMap[][];
	static int visited[][];
	static final int INF = 100 * 1000 + 1;
	
	static int dist [];
	static int revDist [];
			
/*
	static void floid() {
		for(int k=1; k<=n; k++) {
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n; j++) {
					if(map[i][j] > map[i][k] + map[k][j]) {
						map[i][j] = map[i][k] + map[k][j];
					}
				}
			}
		}
		
		int max = Integer.MIN_VALUE;
		for(int i=1; i<=n; i++) {
			if(i==x) {
				continue;
			}
			max = Math.max(max, map[i][x] + map[x][i]);
		}
		System.out.println(max);
	}
	*/
	static void init(int [] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = INF;
		}
	}
	
	static void dijkstra(int map [][], int dist []) {
		Queue<Integer> q = new LinkedList<>();
		
		dist[x] = 0;
		
		q.add(x);
		while(!q.isEmpty()) {
			int front = q.remove();
			
			for(int i=1; i<=n; i++) {
				if(dist[i] > map[front][i] + dist[front]) {
					dist[i] = map[front][i] + dist[front];
					q.add(i);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int m = sc.nextInt();
		x = sc.nextInt();
		
		dist = new int [n+1];
		revDist = new int [n+1];
		
		map = new int [n+1][n+1];
		revMap = new int [n+1][n+1];
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				map[i][j] = INF;
				revMap[i][j] = INF;
				
				if(i==j) {
					map[i][j] = 0;
					revMap[i][j] = 0;
				}
			}
		}
		
		for(int i=0; i<m; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			int cost = sc.nextInt();
			
			map[start][end] = revMap[end][start] = cost;
		}
		
		//floid();
		
		init(dist);
		init(revDist);
		
		int max = Integer.MIN_VALUE;
		
		dijkstra(map, dist);
		dijkstra(revMap, revDist);
		
		for(int i=1; i<=n; i++) {
			max = Math.max(max, dist[i]+revDist[i]);
		}
		
		System.out.println(max);
		
	}

}
