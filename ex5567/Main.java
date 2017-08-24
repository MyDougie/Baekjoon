package ex5567;

/**
 * BFS(결혼식) - 2017/08/24 - Park Taegyu
 * */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int friends [][] = new int [n+1][n+1];
		int come [] = new int [n+1];
		
		Queue<Integer> q = new LinkedList<>();
		
		int m = sc.nextInt();
		for(int i=1; i<=m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			friends[a][b] = friends[b][a] = 1; 
		}
		
		
		for(int i=2; i<=n; i++) {
			if(friends[1][i] == 1) {
				come[i] = 1;
				q.add(i);
			}
		}
	
		while (!q.isEmpty()) {
			int front = q.remove();
			for (int j = 1; j <= n; j++) {
				if (front == j) {
					continue;
				}

				if (friends[front][j] == 1 && j!=1) {
					come[j] = 1;
				}
			}

		}
		
		int ans = 0;
		for(int i=1; i<=n; i++) {
			ans += come[i];
		}
		System.out.println(ans);
		
	}

}
