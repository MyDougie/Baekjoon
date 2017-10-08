package ex2193;

import java.util.Scanner;
/**
 * DP(이친수) - 2017/05/16 - Complete
 * */

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long[][] dp = new long[91][2];
      
      dp[1][1] = 1;
      dp[2][0] = 1;
      
      for(int i=3; i<=n; i++) {
         dp[i][0] = dp[i-1][0] + dp[i-1][1];
         dp[i][1] = dp[i-1][0];
      }
      
      System.out.println(dp[n][0] + dp[n][1]);
   }

}