package ex1992;

/**
 * 분할과 정복(쿼드트리) - 2017/07/15 - Complete
 * */
import java.util.Scanner;

public class Main {
	
	static void quad(int [][] arr, int n, int x, int y) {
		
		int temp = arr[x][y];
		for(int i=x; i<x+n; i++) {
			for(int j=y; j<y+n; j++) {
				if(temp != arr[i][j]) {
					System.out.print("(");

					quad(arr, n/2, x, y);
					quad(arr, n/2, x, y + n/2);
					quad(arr, n/2, x + n/2, y);
					quad(arr, n/2, x + n/2, y + n/2);
					
					System.out.print(")");
					
					return;
				}
			}
			
		}
		System.out.print(temp);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int arr [][] = new int [n][n];
		
		for(int i=0; i<n; i++) {
			String str = sc.nextLine();
			for(int j=0; j<n; j++) {
				arr[i][j] = str.charAt(j) - '0';
			}
		}
		
		quad(arr, n, 0, 0);
		
	}
}
