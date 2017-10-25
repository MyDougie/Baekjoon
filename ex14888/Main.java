package ex14888;

/**
 * DFS(연산자 끼워넣기) - 2017/10/25 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	static int n;
	static int[] arr;
	static int[] operator;
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	
	static void solve() {
		dfs(0, arr[0], operator[0], operator[1], operator[2], operator[3]);
	}
	
	static void dfs(int index, int sum, int plus, int minus, int multi, int div) {
		if(index == n-1) {
			max = Math.max(max, sum);
			min = Math.min(min, sum);
			return;
		}
		
		if(plus>0) {
			dfs(index+1, sum + arr[index+1], plus-1, minus, multi, div);
		}
		if(minus>0) {
			dfs(index+1, sum - arr[index+1], plus, minus-1, multi, div);
		}
		if(multi>0) {
			dfs(index+1, sum * arr[index+1], plus, minus, multi-1, div);
		}
		if(div>0) {
			dfs(index+1, sum / arr[index+1], plus, minus, multi, div-1);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		operator = new int[4];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<4; i++) {
			operator[i] = sc.nextInt();
		}
		
		solve();
		
		System.out.println(max);
		System.out.println(min);
		
	}

}
