package ex14890;

/**
 * DFS(경사로) - 2017/10/25 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	static int n, x;
	static int[][] map;
	static boolean[][] visited;
	static int ans;
	
	static int solve() {
		ans = 0;
		
		int[][] reverseMap = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				reverseMap[j][i] = map[i][j];
			}
		}
		
		visited = new boolean[n][n];
		for(int i=0; i<n; i++) {
			dfs(i, 0, map, 0);//row col
			
		}
		
		visited = new boolean[n][n];
		for(int i=0; i<n; i++) {
			dfs(i, 0, reverseMap, 0);
		}
		
		return ans;
	}
	
	static void dfs(int row, int col, int[][] map, int upDown) {
		visited[row][col] = true;
		
		if(col == n-1) {
			ans++;
			return;
		}
		
		if(col + x < n) {
			if(!visited[row][col+x] && map[row][col] + 1 == map[row][col+x] && upDown != 1) {
				boolean canJump = true;
				for(int i=col; i<col+x; i++) {
					if(map[row][i] != map[row][col]) {
						canJump = false;
						break;
					}
				}
				if(canJump) {
					dfs(row, col+x, map, 0);//up
				}
			}
			else if(!visited[row][col+x] && map[row][col] - 1 == map[row][col+x]) {
				boolean canJump = true;
				for(int i=col+1; i<=col+x; i++) {
					if(map[row][i] != map[row][col+x]) {
						canJump = false;
						break;
					}
				}
				if(canJump) {
					dfs(row, col+x, map, 1);//down
				}
			}
		}
		
		if(!visited[row][col+1] && map[row][col]==map[row][col+1]) {
			dfs(row, col+1, map, 0);//flat
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		x = sc.nextInt();
		map = new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(solve());
	}

}
