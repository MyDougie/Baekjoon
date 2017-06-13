package ex11053;

import java.util.Scanner;
/**
 * LIS's length - 2017/06/10 - Complete
 * */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr [] = new int[n+1];
		int dp [] = new int[n+1];
		int max = 0;
		
		for(int i=1; i<=n; i++){
			arr[i] = sc.nextInt();
		}
		
		for(int i=1; i<=n; i++){
			int min = 0;
			for(int j=0; j<i; j++){
				if(arr[i] > arr[j]){
					if(min < dp[j]){
						min = dp[j];
					}
				}
			}
			dp[i] = min + 1;
			if(max < dp[i]){
				max = dp[i];
			}
		}
		
		System.out.println(max);
	
	}

}

