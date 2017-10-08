package ex11054;

/**
 * DP(가장 긴 바이토닉 부분수열) - 2017/10/08 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	public static int[] getLIS(int[] arr) {
		int[] dp = new int[arr.length+1];
		
		for(int i=1; i<arr.length; i++) {
			dp[i] = 1;
			for(int j=0; j<i; j++) {
				if(arr[j] < arr[i] && dp[j]+1 > dp[i]) {
					dp[i] = dp[j]+1;
				}
			}
		}
		
		return dp;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n+1];
		int reverseArr[] = new int[n+1];
		for(int i=1; i<=n; i++) {
			arr[i] = reverseArr[n-i+1] = sc.nextInt();
		}

		int ans=0;
		int[] increase = getLIS(arr);
		int[] decrease = getLIS(reverseArr);
		
		for(int i=1; i<=n; i++) {
			ans = Math.max(ans, increase[i] + decrease[n-i+1]-1);
		}
		System.out.println(ans);
		
	}

}
