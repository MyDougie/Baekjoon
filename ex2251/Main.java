package ex2251;

/**
 * BFS(물통) - 2017/09/27 - Park Taegyu
 * */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static List<Integer> list = new ArrayList<>();
	static boolean visited[][][];
	static int arr[];

	class Pair{
		int a,b,c;
		Pair(int a, int b, int c){
			this.a = a;
			this.b = b;
			this.c = c;
		}
	}
	
	void process() {
		Scanner sc = new Scanner(System.in);
		arr = new int[3];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		visited = new boolean[201][201][201];
		
		bfs(0, 0, arr[2]);
		Collections.sort(list);
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
			if(i!=list.size()-1) {
				System.out.print(" ");
			}
		}
		
	}
	
	void bfs(int a, int b, int c) {
		if(!visited[a][b][c]) {
			visited[a][b][c] = true;
			if(a == 0) {
				list.add(c);
			}
			
			if(a>0) {
				//a to b
				if(a+b> arr[1]) {
					bfs(a+b-arr[1], arr[1], c);
				}else {
					bfs(0, a+b, c);
				}
				//a to c
				if(a+c> arr[2]) {
					bfs(a+c-arr[2], b, arr[2]);
				}else {
					bfs(0, b, a+c);
				}
			}
			
			if(b>0) {
				//b to a
				if(a+b> arr[0]) {
					bfs(arr[0], a+b-arr[0], c);
				}else {
					bfs(a+b, 0, c);
				}
				//b to c
				if(b+c> arr[2]) {
					bfs(a, b+c-arr[2], arr[2]);
				}else {
					bfs(a, 0, b+c);
				}
			}
			
			if(c>0) {
				//c to a
				if(a+c> arr[0]) {
					bfs(arr[0], b, a+c-arr[0]);
				}else {
					bfs(a+c, b, 0);
				}
				//c to b
				if(b+c> arr[1]) {
					bfs(a, arr[1] , b+c-arr[1]);
				}else {
					bfs(a, b+c, 0);
				}
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.process();
		
	}

}
