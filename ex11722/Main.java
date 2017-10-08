package ex11722;

import java.util.Scanner;
/**
 * LDS's length - 2017/06/13 - Complete
 * */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr [] = new int[n+1];
		int dp [] = new int[n+1];
		
		for(int i=1; i<=n; i++){
			arr[i] = sc.nextInt();
		}
		
		int ans=0;
		
		for(int i=1; i<=n; i++){
			dp[i] = 1;
			for(int j=0; j<i; j++){
				if(arr[j] > arr[i] && dp[j] + 1 > dp[i] ){
					dp[i] = dp[j] + 1;
				}
			}
			ans = Math.max(ans, dp[i]);
		}
		
		System.out.println(ans);
	}

}
