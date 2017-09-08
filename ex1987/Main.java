package ex1987;

/**
 * DFS(알파벳) - 2017/09/08 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	static int row, col;
	static char map[][];
	static int dx [] = {-1,0,1,0};
	static int dy [] = {0,1,0,-1};
	static int max;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		
		String str [] = sc.nextLine().split(" ");
		row = Integer.parseInt(str[0]);
		col = Integer.parseInt(str[1]);
		
		map = new char [row+1][col+1];
		
		for(int i=1; i<=row; i++) {
			String input [] = sc.nextLine().split("");
			for(int j=0; j<input.length; j++) {
				map[i][j+1] = input[j].charAt(0);
			}
		}
		
	}
	
	void solve() {
		dfs(map[1][1]+"",1,1,1);
		System.out.println(max);
	}
	
	void dfs(String str,int x, int y, int depth) {
		max = Math.max(max, str.length());
		
		for(int i=0; i<4; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			
			if(nextX>0 && nextY>0 && nextX<=row && nextY<=col && !str.contains(map[nextX][nextY]+"")) {
				dfs(str+map[nextX][nextY], nextX, nextY, depth+1);
			}
		}
		
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.input();
		main.solve();
	}

}
