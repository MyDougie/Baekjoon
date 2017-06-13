package ex2156;

import java.util.Scanner;
/**
 * DP(포도주 시식) - 2017/06/07 - Complete
 * */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr [] = new int [n+1];
		int dp [] = new int [n+1];
		for(int i=1; i<=n; i++){
			arr[i] = sc.nextInt();
		}
		
		dp[1] = arr[1];
		if(n>=2){
			dp[2] = dp[1] + arr[2];
		}
		
		if(n>=3){
			dp[3] = Math.max(dp[2], Math.max(dp[1] + arr[3], arr[2] + arr[3]));
		}
		
		for(int i=4; i<=n; i++){
			dp[i] = Math.max(dp[i-1], Math.max(dp[i-2],  dp[i-3] + arr[i-1]) + arr[i]);
		}
		 
		int max = 0;
		for(int x : dp){
			if(max < x){
				max = x;
			}
		}
		System.out.println(max);
		
	}

}
