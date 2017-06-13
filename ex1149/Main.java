package ex1149;

import java.util.Scanner;
/**
 * DP(RGB°Å¸®) - 2017/04/19 - Complete
 * */
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		int cost[][] = new int[3][n]; 
		int r,g,b;
		
		cost[0][0] = input.nextInt();
		cost[1][0] = input.nextInt();
		cost[2][0] = input.nextInt();
		
		for(int i=1; i<n; i++){
			r = input.nextInt(); 
			g = input.nextInt();
			b = input.nextInt();
			
			cost[0][i] = r + Math.min(cost[1][i-1], cost[2][i-1]);
			cost[1][i] = g + Math.min(cost[0][i-1], cost[2][i-1]);
			cost[2][i] = b + Math.min(cost[0][i-1], cost[1][i-1]);
			
		}
		System.out.println(Math.min(cost[2][n-1], Math.min(cost[0][n-1], cost[1][n-1])));
	}

}