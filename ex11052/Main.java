package ex11052;

/**
 * DP(붕어빵 판매하기) - 2017/09/07 - Park Taegyu
 * */

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      int[] dp = new int[n+1];
      int[] p = new int[n+1];
      for(int i=1; i<=n; i++) {
         p[i] = sc.nextInt();
      }
      
      for(int i=1; i<=n; i++) {
         for(int j=1; j<=i; j++) {
            dp[i] = Math.max(dp[i], dp[i-j] + p[j]);
         }
      }
      System.out.println(dp[n]);
      
   }

}