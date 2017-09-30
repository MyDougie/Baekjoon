package ex1182;

/**
 * 완전탐색(부분집합의 합) - 2017/08/02 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {
/*
	static int [] makeBinary(int num, int N) {
		int arr [] = new int [N];

		for(int i=N-1; i>=0; i--) {
			arr[i] = num % 2;
			num /= 2;
		}
		
		return arr;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int S = sc.nextInt();
		int result = 0;
		int sum=0;
		
		int arr [] = new int[N];
		int binary [];
		
		int pow = (int) Math.pow(2, N);
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<pow; i++) {
			binary = makeBinary(i, N);
			sum = 0;
			for(int j=0; j<binary.length; j++) {
				if(binary[j] == 1) {
					sum += arr[j];
				}
			}
			if(sum == S) {
				result++;
			}
		}
		if(S==0) result--;
		
		System.out.println(result);
		
	}
*/
	
	static int n, s;
	static int arr[];
	static int ans;
	void process() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		s = sc.nextInt();
		arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			dfs(i, arr[i]);
		}
		
		System.out.println(ans);
		
	}
	
	void dfs(int idx, int sum) {
		if(sum==s) {
			ans++;
		}
		
		for(int i=idx+1; i<arr.length; i++) {
			dfs(i, sum+arr[i]);
		}
		
		
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.process();
	}
}
