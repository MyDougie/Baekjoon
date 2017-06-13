package ex11722;

import java.util.Scanner;
/**
 * LDS's length - 2017/06/13 - Complete
 * */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr [] = new int[n];
		int dp [] = new int[n];
		
		int max = 0;
		
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++){
			int min = 0;
			for(int j=0; j<i; j++){
				if(arr[j] > arr[i]){
					if(dp[j] > min)
						min = dp[j];
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
