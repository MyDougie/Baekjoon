package ex14503;

/**
 * 탐색(로봇 청소기) - 2017/09/07 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	static int N,M;
	static int map[][];
	static int dx [] = {-1, 0, 1, 0};
	static int dy [] = {0, 1, 0, -1};
	static int cnt=1;
	
	class Pair{
		int x;
		int y;
		Pair(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	void solve() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		int robotX = sc.nextInt();
		int robotY = sc.nextInt();
		
		int dir = sc.nextInt(); // 0 - 북, 1 - 동, 2 - 남, 3 - 서
		
		map = new int[N][M];
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		map[robotX][robotY] = 2;
		
		search(robotX, robotY, dir);
		System.out.println(cnt);
	}
	
	void search(int x, int y, int dir) {
		
		int nextX, nextY, nextDir = dir;
		for(int i=0; i<4; i++) {
			nextDir = (nextDir + 3) % 4;
			nextX = x + dx[nextDir];
			nextY = y + dy[nextDir];
			
			if(nextX<1 || nextY<1 || nextX>=N-1 || nextY>=M-1 || map[nextX][nextY]==1) {
				continue;
			}
			
			if(map[nextX][nextY] == 0) {
				cnt++;
				map[nextX][nextY]=2;
				search(nextX, nextY, nextDir);
				return;
			}
			
		}
		
		nextDir = (dir + 2) % 4;
		nextX = x + dx[nextDir];
		nextY = y + dy[nextDir];
		if(map[nextX][nextY]==1) {
			return;
		}else {
			search(nextX, nextY, dir);
		}
		
	}
	
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

}
