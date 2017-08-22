package ex4963;

/**
 * 그래프(BFS, 섬의 개수) - 2017/08/22 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	static int w,h;
	static int map [][];
	static int visited [][];
	static int dx [] = {-1,0,1,-1,1,-1,0,1};   
	static int dy [] = {1,1,1,0,0,-1,-1,-1};
	
	static void bfs(int x, int y) {
		visited[x][y] = 1;
		
		for(int i=0; i<8; i++) {
			int xx = x + dx[i];
			int yy = y + dy[i];

			if(xx>0 && yy>0 && yy<=w && xx<=h && map[xx][yy]==1 && visited[xx][yy]==0) {
				bfs(xx,yy);
			}
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str="";
		
		while(!(str = sc.nextLine()).equals("0 0")) {
			String v[] = str.split(" ");
			w = Integer.parseInt(v[0]);
			h = Integer.parseInt(v[1]);
			
			map = new int [h+1][w+1];
			visited = new int [h+1][w+1];
			
			for(int i=1; i<=h; i++) {
				String temp[] = sc.nextLine().split(" ");
				for(int j=1; j<=temp.length; j++) {
					map[i][j] = Integer.parseInt(temp[j-1]);
				}
			}

			int cnt = 0;
			for(int i=1; i<=h; i++) {
				for(int j=1; j<=w; j++) {
					if(map[i][j]==1 && visited[i][j]==0) {
						bfs(i,j);
						cnt++;
					}
				}
			}
			
			System.out.println(cnt);
			
		}
	}

}
