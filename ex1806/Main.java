package ex1806;

/**
 * 투 포인터(부분합) - 2017/10/01 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	static int n,s;
	static int arr[];
	static int ans = Integer.MAX_VALUE;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		s = sc.nextInt();
		
		arr = new int[n+1];
		for(int i=0; i<arr.length-1; i++) {
			arr[i] = sc.nextInt();
		}
	}

	void process() {
		input();
		solve();
		System.out.println(ans>n ? 0 : ans);
	}
	
	void solve() {
		int sum = arr[0];
		
		int l=0, r=0;
		
		while(l<=r && r<n) {
			if(sum < s) {
				r++;
				sum += arr[r];
			}else if(sum == s) {
				ans = Math.min(ans, r-l+1);
				r++;
				sum += arr[r];
			}else if(sum > s) {
				ans = Math.min(ans, r-l+1);
				sum -= arr[l];
				l++;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		Main main = new Main();
		main.process();
	}

}
