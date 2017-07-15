package ex1780;

import java.util.Scanner;

/**
 * 분할과 정복(종이의 갯수) - 2017/07/15 - Complete
 * */


public class Main {
	static int result [] = new int[3];
	
	public static void divideAndConquer(int arr[][], int n, int xStart, int yStart ) {
		
		int temp = arr[xStart][yStart];
		for(int i=xStart; i<xStart + n; i++) {
			for(int j=yStart; j<yStart + n; j++) {
				if(temp != arr[i][j]) {
					divideAndConquer(arr, n/3, xStart, yStart);
					divideAndConquer(arr, n/3, xStart, yStart + n/3);
					divideAndConquer(arr, n/3, xStart, yStart + 2 * n/3);
					
					divideAndConquer(arr, n/3, xStart + n/3, yStart);
					divideAndConquer(arr, n/3, xStart + n/3, yStart + n/3);
					divideAndConquer(arr, n/3, xStart + n/3, yStart + 2 * n/3);
					
					divideAndConquer(arr, n/3, xStart + 2 * n/3, yStart);
					divideAndConquer(arr, n/3, xStart + 2 * n/3, yStart + n/3);
					divideAndConquer(arr, n/3, xStart + 2 * n/3, yStart + 2 * n/3);
					
					
					return;
				}
			}
		}
		
		result[++temp]++;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr [][] = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		divideAndConquer(arr, n, 0, 0);
		
		for(int x : result) {
			System.out.println(x);
		}
		
		
	}

}
