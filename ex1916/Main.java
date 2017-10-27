package ex1916;

/**
 * Dijkstra(최소비용 구하기) - 2017/10/28 - Park Taegyu
 * */
import java.util.*;

public class Main {

	static int n;
	static List<Node> graph[];
	static int[] cost;
	static int INF = 987654321;
	
	static class Node{
		int v, w;
		Node(int v, int w){
			this.v = v;
			this.w = w;
		}
	}
	
	static void dijkstra(int start, int end) {
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		
		while(!q.isEmpty()) {
			int s = q.poll();
			
			for(int i=0; i<graph[s].size(); i++) {
				Node e = graph[s].get(i);
				
				if(cost[e.v] > cost[s] + e.w) {
					cost[e.v] = cost[s] + e.w;
					q.add(e.v);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		graph = new ArrayList[n+1];
		cost = new int[n+1];
		for(int i=1; i<=n; i++) {
			graph[i] = new ArrayList<>();
			cost[i] = INF;
		}
		
		int m = sc.nextInt();
		for(int i=0; i<m; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			int weight = sc.nextInt();
			graph[start].add(new Node(end, weight));
		}
		
		int start = sc.nextInt();
		int end = sc.nextInt();
		cost[start] = 0;
		
		dijkstra(start, end);
		System.out.println(cost[end]);
	}

}
