package ex11055;

import java.util.Scanner;
/**
 * LIS's sum - 2017/06/10 - Complete
 * */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr [] = new int[n+1];
		int dp [] = new int[n+1];
		int ans = 0;
		
		for(int i=1; i<=n; i++){
			arr[i] = sc.nextInt();
		}
		
		for(int i=1; i<=n; i++) {
			dp[i] = arr[i];
			for(int j=0; j<i; j++) {
				if(arr[j] < arr[i] && dp[i] < dp[j] + arr[i]) {
					dp[i] = dp[j] + arr[i];
				}
			}
			ans = Math.max(ans, dp[i]);
		}
		
		System.out.println(ans);
	
	}

}

