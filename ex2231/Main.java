package ex2231;

/**
 * 완전탐색(분해합) - 2017/08/26 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		final int m = 999999+9+9+9+9+9+10;
		
		int arr[] = new int [m+1];
		
		for(int i=1; i<=m; i++) {
			arr[i] = Integer.MAX_VALUE;//분해합 저장
		}
		
		int cnt = 0;//자릿수
		int temp = n;
		while(temp>0) {
			temp /= 10;
			cnt++;
		}
		
		for(int i=n-9*cnt; i<=n; i++) {
			//분해합구하고
			String str = i+"";
			int divideSum = i;
			for(int j=0; j<str.length();j++) {
				divideSum += (int)str.charAt(j)-'0';
			}
			
			//System.out.println("divSum : " + divideSum);
			
			//더 작으면 배열에 저장	
			arr[divideSum] = Math.min(arr[divideSum], i);
		}
		
		System.out.println((arr[n]!=Integer.MAX_VALUE) ? arr[n] : 0);
		
	}

}
