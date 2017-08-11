package ex1389;

/**
 * 플로이드 와샬(케빈 베이컨의 6단계 법칙) - 2017/08/11 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {
	static int n;
	static int m;
	static int map[][];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		map = new int [n+1][n+1];
		
		int INF = 1000000000; 
		int result [] = new int[n+1];
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==j) {
					map[i][j] = 0;
				}else {
					map[i][j] = INF;
				}
			}
		}
		
		for(int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			map[a][b] = 1;
			map[b][a] = 1;
		}
		
		for(int i=1; i<=n; i++) {//경유지
			for(int j=1; j<=n; j++) {//출발지
				for(int k=1; k<=n; k++) {//도착지
					if(j==k) {
						continue;
					}
					
					if(map[j][k] > map[j][i] + map[i][k]) {
						map[j][k] = map[j][i] + map[i][k];
					}
				}
			}
		}
		
		int min = INF;
		int p = 0;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				result[i] += map[i][j];
			}
			if(min > result[i]) {
				min = result[i];
				p = i;
			}
			
		}
		
		System.out.println(p);
		
	}
}
