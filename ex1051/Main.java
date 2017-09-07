package ex1051;

/**
 * 완전탐색(숫자 정사각형) - 2017/09/07 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	static int N, M;
	static int map[][];
	static int max;

	void input(){
		Scanner sc =new Scanner(System.in);
		String input [] = sc.nextLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);

		map = new int[N][M];

		for(int i=0; i<N; i++){
			String v [] = sc.nextLine().split("");
			for(int j=0; j<v.length; j++){
				map[i][j] = Integer.parseInt(v[j]);
			}
		}
	}

	void solve(){
		
		for(int i=0; i<N; i++){
			for(int j=0; j<M; j++){
				max = Math.max(max, search(i,j));
			}
		}
		System.out.println(max);
	}

	int search(int x, int y){
		int len = 0;
		
		while(x+len<N-1 && y+len<M-1){
			len++;
		} 		
		
		while(true){
			int nextX = x + len;
			int nextY = y + len;
			
			if((map[x][y] != map[nextX][y]) || (map[x][y] != map[x][nextY]) || (map[x][y] != map[nextX][nextY])) {
				len--;
			}else {
				return (len+1) * (len+1);
			}
			
		}

	}


	public static void main(String[] args) {
		Main main = new Main();
		main.input();
		main.solve();
	}

}
