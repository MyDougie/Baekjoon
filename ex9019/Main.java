package ex9019;

/**
 * BFS(DSLR) - 2017/09/12 - Park Taegyu 
 * */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int n;
	static boolean visited[];
	static char [] order = {'D', 'S', 'L', 'R'};
	
	class Pair{
		int num;
		String order;
		Pair(int num, String order){
			this.num = num;
			this.order = order;
		}
	}
	
	void process() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		visited = new boolean[10000];
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			bfs(a, b);
			for(int j=0; j<visited.length; j++) {
				visited[j] = false;
			}
		}
		
	}
	
	void bfs(int a, int b) {
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(a, ""));
		visited[a] = true;
		
		while(!q.isEmpty()) {
			Pair p = q.remove();
			
			if(p.num == b) {
				System.out.println(p.order);
				return;
			}
			
			for(int i=0; i<order.length; i++) {
				int num = func(p.num, order[i]);
				if(!visited[num]) {
					visited[num] = true;
					q.add(new Pair(num, p.order+order[i]));
				}
			}
			
		}
		
	}
	
	int func(int num, char order) {
		int ret=0;
		switch(order) {
		case 'D': ret = (num*2) % 10000; break;
		case 'S': ret = (num==0) ? 9999 : num-1; break;
		case 'L': 
			if(num==0) return ret;
			int first = num / 1000;
			int last = num % 1000;
			ret = (last*10) + first;
			
			break;
		case 'R': 
			if(num==0) return ret;
			int first2 = num / 10;
			int last2 = num % 10;
			ret = (last2*1000) + first2;
			break;
		}
		return ret;
		
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.process();
	}

}
