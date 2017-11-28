package ex2775;

/**
 * 부녀회장이 될테야 - 2017/11/28 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tn = sc.nextInt();
		for(int t=0; t<tn; t++) {
			int k = sc.nextInt();//층
			int n = sc.nextInt();//호
			
			int[][] apart = new int[k+1][n+1];
			
			for(int i=1; i<n+1; i++) {
				apart[0][i] = i;
			}
			
			for(int i=1; i<k+1; i++) {
				for(int j=1; j<n+1; j++) {
					for(int x=1; x<=j; x++) {
						apart[i][j] += apart[i-1][x];
					}
				}
			}
			
			System.out.println(apart[k][n]);
		}
	}

}
