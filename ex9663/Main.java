package ex9663;

/**
 * 백트래킹(N-Queen) - 2017/09/29 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	static int n;
	static int cols[];
	static int ans;
	
	void process() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		cols = new int[n];
		for(int i=0; i<n; i++) {
			cols[i] = -1;
		}
		
		backTracking(0);
		System.out.println(ans);
	}
	
	void backTracking(int row) {
		if(row == n) {
			ans++;
		}else {
			for(int col=0; col<cols.length; col++) {
				if(isPossible(row, col)) {
					cols[row] = col;
					backTracking(row+1);
					cols[row] = -1;
				}
			}
		}
	}
	
	boolean isPossible(int targetRow, int targetCol) {
		for(int row=0; row<cols.length; row++) {
			if(targetCol == cols[row] || targetRow - row == Math.abs(targetCol - cols[row])) {
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
