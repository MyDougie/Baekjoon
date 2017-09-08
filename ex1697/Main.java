package ex1697;

/**
 * BFS(숨바꼭질) - 2017/09/08 - Park Taegyu
 * */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int start, end;
	static boolean visited[];
	static int dir [] = {1, -1, 2};
	
	class Pair{
		int pos;
		int breath;
		Pair(int pos, int breath){
			this.pos = pos;
			this.breath = breath;
		}
	}
	
	void input() {
		Scanner sc = new Scanner(System.in);
		start = sc.nextInt();
		end = sc.nextInt();
		
		visited = new boolean[100001];
	}
	
	void solve() {
		bfs(start);
	}
	
	
	void bfs(int start) {
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(start, 0));
		visited[start] = true;
		
		while(!q.isEmpty()) {
			Pair p = q.remove();
			if(p.pos == end) {
				System.out.println(p.breath);
				return;
			}
			
			for(int i=0; i<3; i++) {
				int nextPos;
				if(i==2) {
					nextPos = p.pos * dir[i];
				}else {
					nextPos = p.pos + dir[i];
				}
				
				if(nextPos>=0 && nextPos<=100000 &&!visited[nextPos]) {
					visited[nextPos] = true;
					q.add(new Pair(nextPos, p.breath+1));
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
