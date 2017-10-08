package ex2747;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      long result=0;
      long x=0, y=1;
      if(n==1) {
         System.out.println(1);
         return;
      }
      for(int i=1; i<n; i++) {
         result = x+y;
         x = y;
         y = result;
      }
      System.out.println(result);
   }

}