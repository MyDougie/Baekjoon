package ex14889;

/**
 * 조합(스타트와 링크) - 2017/10/25 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	static int[][] map;
	static int[] arr;
	static int[] team1, team2;
	static int N;
	static int ans;
	
	static void comb(int n, int r) {
		if(r==0) {
			team2 = new int[team1.length];
			int cnt=0;
			for(int i=0; i<N; i++) {
				boolean contains = false;
				for(int j=0; j<team1.length; j++) {
					if(team1[j] == i) {
						contains = true;
					}
				}
				if(!contains) {
					team2[cnt++] = i;
				}
			}
			
			calculate();
	
		}else if(r>n) {
			return;
		}else {
			team1[r-1] = arr[n-1];
			comb(n-1, r-1);
			comb(n-1, r);
		}
	}
	
	static void calculate() {
		
		
		int sum1 = 0;
		for(int i=0; i<team1.length; i++) {
			for(int j=i+1; j<team1.length; j++) {
				sum1 += map[team1[i]][team1[j]] + map[team1[j]][team1[i]];
			}
		}
		
		int sum2 = 0;
		for(int i=0; i<team2.length; i++) {
			for(int j=i+1; j<team2.length; j++) {
				sum2 += map[team2[i]][team2[j]] + map[team2[j]][team2[i]];
			}
		}
		
		ans = Math.min(ans, Math.abs(sum1-sum2));
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		map = new int[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		arr = new int[N];
		team1 = new int[N/2];
		for(int i=0; i<N; i++) {
			arr[i] = i;
		}
		ans = Integer.MAX_VALUE;
		comb(N, N/2);
		System.out.println(ans);
	}

}
