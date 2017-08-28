package ex6603_2;

/**
 * DFS(로또) - 2017/08/28 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	static int k;
	static int arr[];
	static int cnt;
	static StringBuffer sb = new StringBuffer();
	
	static Scanner sc = new Scanner(System.in);
	
	private static void solve() {
		while((k=sc.nextInt())!=0) {
			arr = new int [13];
			
			for(int i=0; i<k; i++) {
				arr[i] = sc.nextInt();
			}
			
			for(int i=0; i<k; i++) {
				cnt = 1;
				dfs(i, arr[i]+" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	
	public static void dfs(int v, String str) {
		if(cnt == 6) {
			sb.append(str + "\n");
		}else {
			for(int i=v+1; i<k; i++) {
				cnt++;
				dfs(i, str + arr[i] + " ");
			}
		}
		cnt--;
	}
	
	
	
	public static void main(String[] args) {
		solve();
	}

}
