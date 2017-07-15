package ex10844;

/**
 * DP(쉬운 계단 수) - 2017/05/14 - Complete
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//첫번째 인덱스 : 자리수
		//두번째 인덱스 : 몇으로 끝나는지의 숫자
		int dp [][] = new int[101][10];
		long result = 0;
		
		for(int i=1; i<10; i++){
			dp[1][i] = 1;
		}
		
		for(int i=2; i<=n; i++){
			for(int j=0; j<=9; j++){
				if( j == 0){
					dp[i][j] = dp[i-1][1] ;
				}else if( j == 9 ){
					dp[i][j] = dp[i-1][8] ;
				}else{
					dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % 1000000000;
				}
			}
		}
		
		
		for(int i=0; i<=9; i++){
			result += dp[n][i];
		}
		result %= 1000000000;
		System.out.println(result);
	}

}