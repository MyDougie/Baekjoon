package ex1018;

/**
 * 완전탐색(체스판 다시 칠하기) - 2017/09-08 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	static int N,M;
	static char map[][];
	static char whiteChess[][];
	static char blackChess[][];
	static int ans = 64;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		map = new char[N][M];
		whiteChess = new char[8][8];
		blackChess = new char[8][8];
		for(int i=0; i<N; i++) {
			String str [] = sc.next().split("");
			for(int j=0; j<str.length; j++) {
				map[i][j] = str[j].charAt(0);
			}
		}
		
		boolean flag= true;
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				if(flag) {
					blackChess[i][j] = 'B';
					whiteChess[i][j] = 'W';
				}else {
					blackChess[i][j] = 'W';
					whiteChess[i][j] = 'B';
				}
				flag = !flag;
			}
			flag = !flag;
		}
		
	}
	
	void solve() {
		for(int i=0; i<=N-8; i++) {
			for(int j=0; j<=M-8; j++) {
				ans = Math.min(ans, search(i,j));
			}
		}
		System.out.println(ans);
	}
	
	int search(int x, int y) {
		int blackSub=0;
		int whiteSub=0;
		
		for(int i=x; i<x+8; i++) {
			for(int j=y; j<y+8; j++) {
				if(map[i][j] != blackChess[i-x][j-y]) {
					blackSub++;
				}
				if(map[i][j] != whiteChess[i-x][j-y]) {
					whiteSub++;
				}
			}
		}
		
		return Math.min(blackSub, whiteSub);
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.input();
		main.solve();
	}

}
