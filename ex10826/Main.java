package ex10826;

/**
 * 피보나치 수열 - 2017/10/08 - Park Taegyu
 * */
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      
      BigInteger result = new BigInteger("0");
      BigInteger x = new BigInteger("0");
      BigInteger y = new BigInteger("1");
      if(n==1) {
         System.out.println(1);
         return;
      }
      for(int i=1; i<n; i++) {
         result = x.add(y);
         x = y;
         y = result;
      }
      System.out.println(result);
   }

}