package ex1058;


/**
 * BFS(친구) - 2017/08/24 - Park Taegyu
 * */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pair{
	int value;
	int breath;
	Pair(int value, int breath){
		this.value = value;
		this.breath = breath;
	}
}

public class Main {

	static char adj [][];
	static int visited [];
	
	
	static int bfs(int vertex) {
		for(int i=0; i<visited.length; i++) {
			visited[i] = 0;
		}
		
		visited[vertex] = 1;
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(vertex, 0));
		
		while(!q.isEmpty()) {
			int front = q.peek().value;
			int breath = q.peek().breath;
			q.remove();
			
			if(breath == 2) {
				break;
			}
			
			for(int i=1; i<visited.length; i++) {
				if(adj[front][i] == 'Y' && visited[i] == 0) {
					visited[i] = 1;
					q.add(new Pair(i, breath+1));
				}
				
			}
			
		}
		
		int ret = 0;
		for(int i=1; i<visited.length; i++) {
			ret += visited[i];
		}
		
		return ret-1;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		adj = new char [n+1][n+1];
		visited = new int [n+1];
		
		for(int i=1; i<=n; i++) {
			String input = sc.next();
			for(int j=0; j<input.length(); j++) {
				adj[i][j+1] = input.charAt(j);
			}
		}
		
		int ret = 0;
		for(int i=1; i<=n; i++) {
			ret = Math.max(ret, bfs(i));
		}
		System.out.println(ret);
		
	}

}
