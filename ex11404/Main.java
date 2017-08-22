package ex11404;

/**
 * 그래프(플로이드 워셜) - 2017/08/22 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	static int map [][];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		map = new int [n+1][n+1];
		int m = sc.nextInt();
		for(int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(map[a][b] != 0 && map[a][b] < c) {
				continue;
			}
			
			map[a][b] = c;
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(map[i][j] == 0 && i!=j) {
					map[i][j] = 100000;
				}
			}
		}
		
		
		for(int i=1; i<=n; i++) {//경유지
			for(int j=1; j<=n; j++) {//출발지
				for(int k=1; k<=n; k++) {//도착지
					map[j][k] = Math.min(map[j][k], map[j][i] + map[i][k]);
				}
			}
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}

