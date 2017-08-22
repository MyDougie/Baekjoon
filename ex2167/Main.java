package ex2167;
/**
 * DP(2차원 배열의 합) - 2017/08/22 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr [][] = new int[n+1][m+1];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int k = sc.nextInt();
		
		for(int i=0; i<k; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			long sum = 0;
			for(int x=a-1; x<c; x++) {
				for(int y=b-1; y<d; y++) {
					sum += arr[x][y];
				}
			}
			System.out.println(sum);
			
		}
		
	}

}
