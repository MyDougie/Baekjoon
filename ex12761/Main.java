package ex12761;

/**
 * BFS(돌다리) - 2017/08/13 - Park Taegyu
 * */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int visited [] = new int [100001];
		
		Queue<Integer> q = new LinkedList<>();
		q.add(n);
		visited[n]=1;
		int count = 0;
		
		while(!q.isEmpty()) {
			int size = q.size();
			while(size>0) {
				int pos = q.remove();
				int next [] = {1, -1, a, b, -a, -b, pos*a, pos*b, -pos*a, -pos*b};
				
				if(pos == m) {
					System.out.println(count);
					return;
				}
				
				for(int i=0; i<next.length; i++) {
					int nextPos;
					if(i<6) {
						nextPos = pos+next[i];
					}else {
						nextPos = next[i];
					}
					if(nextPos < 0 || nextPos > m || visited[nextPos] == 1) { 
						continue;
					}
					visited[nextPos] = 1;
					q.add(nextPos);
				}
				size--;
			}
			count++;
			
		}
	}

}
