package ex1963;

/**
 * BFS(소수 경로) - 2017/08/12 - Park Taegyu
 * */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int visited [];
	static Queue<Integer> q;
	
	static void addPrimeNumber(int n){
		Queue<Integer> que = new LinkedList<>();
		
		for(int i=1000; i<9999; i++) {
			boolean primeNum = true;
			for(int j=2; j<=Math.sqrt(i); j++) {
				if(i % j == 0) {
					primeNum = false;
					break;
				}
			}
			if(primeNum) {//소수
				String strNum = i+""; 
				int cnt = 0;
				for(int j=0; j<4; j++) {
					if(strNum.charAt(j) != (n+"").charAt(j)) {
						cnt++;
					}
				}
				if(cnt == 1) {
					if(visited[i] == 0) {
						q.add(i);
						visited[i] = 1;
					}
				}
			}
		}

	}
	
	static void initVisited() {
		for(int i=0; i<visited.length; i++) {
			visited[i] = 0;
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		visited = new int [10001]; 
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			
			q = new LinkedList<>();
			q.add(a);
			visited[a] = 1;

			boolean flag = true;
			int count = 0;
			while(!q.isEmpty() && flag) {
				int sz = q.size();
				while(sz > 0 ) {
					if(q.peek() == b) {
						System.out.println(count);
						flag = false;
						break;
					}else {
						
						int front = q.remove();
						//if(visited[front] == 0) {
							addPrimeNumber(front);
						//}
					}
					
					sz--;
				}
				if(!flag) {
					break;
				}
				count++;
			}
			q.clear();
			initVisited();
			
		}
	}

}
