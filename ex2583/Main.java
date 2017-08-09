package ex2583;

/**
 * DFS(영역 구하기) - 2017/08/09 - Park Taegyu
 * */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0,0};
	static int n;
	static int m;
	static int l;
	
	static int dfs(int[][] map, int x, int y) {
		if(x<0 || y<0 || x>=n || y>=m || map[x][y] == 1 ) {
			return 0;
		}
		
		map[x][y] = 1;
		
		int sum = 1;
		for(int i=0; i<4; i++) {
			sum += dfs(map, x+dx[i], y+dy[i]);
			
		}
		return sum;
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		l = sc.nextInt();
		
		int map [][] = new int[n][m];
		int rec [] = new int[4];
		List<Integer> result = new ArrayList<>();
		
		for(int i=0; i<l; i++) {
			for(int j=0; j<4; j++) {
				rec[j] = sc.nextInt();
			}
			
			for(int j=rec[1]; j<rec[3]; j++) {
				for(int k=rec[0]; k<rec[2]; k++) {
					map[j][k] = 1;
				}
			}
			
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(map[i][j] == 0) {
					result.add(dfs(map,i,j));
				}
			}
		}
		
		System.out.println(result.size());
		Collections.sort(result);
		for(int re : result) {
			System.out.print(re + " ");
		}
		
	}

}
