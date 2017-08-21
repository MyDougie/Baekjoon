package ex1010;

/**
 * DP(조합)(다리 놓기) - 2017/08/21 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int arr [][] = new int [b+1][b+1];
			
			for(int j=1; j<=b; j++) {
				arr[j][0] = arr[j][j] = 1;
				for(int k=1; k<j; k++) {
					arr[j][k] = arr[j-1][k-1] + arr[j-1][k];
				}
			}
			System.out.println(arr[b][a]);
		}
			
	}

}
