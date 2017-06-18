package ex1932;
/**
 * DP(¼ıÀÚ»ï°¢Çü) - 2017/04/19 - Complete
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = Integer.parseInt(input.nextLine());
		int dist[][] = new int[n][n];
		
		for(int i=0; i<n; i++){
			for(int j=0; j<=i; j++){
				dist[i][j] = input.nextInt();
			}
		}
		
		for(int i=1; i<n; i++){
			for(int j=0; j<=i; j++){
				if(j==0){
					dist[i][j] += dist[i-1][j];				
				}else if(j==i){
					dist[i][j] += dist[i-1][j-1];
				}else{
					dist[i][j] += Math.max(dist[i-1][j-1], dist[i-1][j]);
				}
			} 
		}
		
		int max = Integer.MIN_VALUE;
		for(int i=0; i<n; i++){
			if(max < dist[n-1][i])
				max = dist[n-1][i];
		}
		System.out.println(max);

	}
}