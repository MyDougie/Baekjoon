package ex10974;

/**
 * DFS(모든 순열) - 2017/09/11 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	static int n;
	static int arr[];
	static StringBuffer sb = new StringBuffer();
	static String input;
	static String ans;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.nextLine());
		
		arr = new int [n+1];
		
		for(int i=1; i<=n; i++) {
			arr[i] = i;
		}
		
	}
	
	void solve() {
		for(int i=1; i<=n; i++) {
			dfs(arr[i]+"", 1);
		}
		System.out.println(sb);
		
	}
	
	void dfs(String str, int depth) {		
		if(depth==n) {
			sb.append(str + "\n");
			return ;
		}
		
		for(int i=1; i<arr.length; i++) {
			if(!str.contains(arr[i]+"")) {
				dfs(str+" " +arr[i], depth+1);
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.input();
		main.solve();
	}

}