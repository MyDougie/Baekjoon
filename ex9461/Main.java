package ex9461;

/**
 * DP(파도반 수열) - 2017/09/07 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long p [] = new long [101];
		p[1] = p[2] = p[3] = 1;
		p[4] = p[5] = 2;
		
		for(int j=6; j<=100; j++) {
			p[j] = p[j-5] + p[j-1];
		}
		
		for(int i=1; i<=n; i++) {
			int m = sc.nextInt();
			System.out.println(p[m]);
		}
	}

}
