package ex1507;

/**
 * 플로이드 와샬(궁금한 민호)
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int map [][] = new int [n+1][n+1];
		int chk [][] = new int [n+1][n+1];
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				chk[i][j] = map[i][j] = sc.nextInt();
			}
		}
		
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				for(int k=1; k<=n; k++) {
					
					if(j==i || i==k) {
						continue;
					}
					
					if(map[j][k] == map[j][i] + map[i][k]) {
						chk[j][k] = 0;
					}
					
					if(map[j][k] > map[j][i] + map[i][k]) {
						System.out.println(-1);
						return;
					}
					
					
				}
			}	
		}
		
		int ans = 0;
		for(int i=1; i<=n; i++) {
			for(int j=i+1; j<=n; j++) {
				ans += chk[i][j];
			}
		}
		System.out.println(ans);
		
	}
	
		
}

