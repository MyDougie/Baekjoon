package ex2580;

/**
 * 백트래킹(스도쿠) - 2017/09/29 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	static final int n = 9;
	static int map[][] = new int[n][n];
	static int currentRow, currentCol;
	
	void process() {
		Scanner sc = new Scanner(System.in);
		int zeroCnt=0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				map[i][j] = sc.nextInt();
				if(map[i][j] == 0) {
					zeroCnt++;
				}
			}
		}
		
		backTracking(zeroCnt);
		
	}
	
	boolean findEmpty() {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(map[i][j]==0) {
					currentRow = i;
					currentCol = j;
					return false;
				}
			}
		}
		return true;
	}
	
	void backTracking(int zeroCnt) {
		if(findEmpty()) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					System.out.print(map[i][j] + " ");
				}
				System.out.println();
			}
			System.exit(0);
		}
		
		int i = currentRow;
		int j = currentCol;
		
		for(int k=1; k<=9; k++) {
			if(isPossible(i,j,k)) {
				map[i][j] = k;
				backTracking(zeroCnt-1);
				map[i][j] = 0;
			}
		}
	
	}
	
	boolean isPossible(int row, int col, int val) {
		for(int i=row/3*3; i<row/3*3+3; i++) {
			for(int j=col/3*3; j<col/3*3+3; j++) {
				if(map[i][j] == val) {
					return false;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			if(map[i][col] == val || map[row][i] == val) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.process();
	}

}