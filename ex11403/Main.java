package ex11403;

/**
 * 플로이드 워셜(경로 찾기) - 2017/08/13 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int matrix [][] = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				for(int k=0; k<n; k++) {
					if(matrix[j][i] + matrix[i][k] == 2) {
						matrix[j][k] = 1;
					}
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(((matrix[i][j] != 0) ? 1 : 0 )+ " "); 
			}
			System.out.println();
		}
		
		
	}

}
