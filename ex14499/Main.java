package ex14499;

/**
 * 주사위굴리기 - 2017/10/16 - Park Taegyu
 * */
import java.util.*;

public class Main {

	static int n, m, x, y, k;
	static int[][] map;
	static int dice[] = new int[7];//1:상,4:왼쪽,3:오른쪽,2:뒤,5:앞,6:하
	static int nDice[] = new int[7];
	
	class Pos{
		int nx, ny;
		Pos(){}
		Pos(int nx, int ny){
			this.nx = nx;
			this.ny = ny;
		}
	}
	
	void process() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		x = sc.nextInt();
		y = sc.nextInt();
		k = sc.nextInt();
		
		map = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		Pos result;
		int nx, ny;
		for(int i=0; i<k; i++) {
			int dir = sc.nextInt();
			result = rollTheDice(dir, x, y);
			nx = result.nx;
			ny = result.ny;

			if(nx<0 || ny<0 || nx>=n || ny>=m) continue;
			
			if(map[nx][ny]==0) {
				map[nx][ny] = nDice[6];
			}else {
				nDice[6] = map[nx][ny];
				map[nx][ny]=0;
			}
			System.out.println(nDice[1]);
			
			for(int j=1; j<=6; j++) {
				dice[j] = nDice[j];
			}
			
			x = nx;
			y = ny;
			
			
		}
		
	}
	
	Pos rollTheDice(int dir, int x, int y) {
		int nx, ny;
		int temp;
		if(dir==1) {//동
			nDice[1] = dice[3];
			nDice[3] = dice[6];
			nDice[6] = dice[4];
			nDice[4] = dice[1];
			nDice[2] = dice[2];
			nDice[5] = dice[5];
			nx = x;
			ny = y+1;
		}else if(dir==2) {//서
			nDice[1] = dice[4];
			nDice[4] = dice[6];
			nDice[6] = dice[3];
			nDice[3] = dice[1];
			nDice[2] = dice[2];
			nDice[5] = dice[5];
			nx = x;
			ny = y-1;
		}else if(dir==3) {//북
			nDice[1] = dice[2];
			nDice[2] = dice[6];
			nDice[6] = dice[5];
			nDice[5] = dice[1];	
			nDice[3] = dice[3];
			nDice[4] = dice[4];
			nx = x-1;
			ny = y;
		}else {//남
			nDice[1] = dice[5];	
			nDice[5] = dice[6];
			nDice[6] = dice[2];
			nDice[2] = dice[1];
			nDice[3] = dice[3];
			nDice[4] = dice[4];
			nx = x+1;
			ny = y;
		}
		
		return new Pos(nx, ny);
	}
	
	
	public static void main(String[] args) {
		Main main = new Main();
		main.process();
	}

}
