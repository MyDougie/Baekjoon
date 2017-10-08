package ex2661;

/**
 * 백트래킹(좋은 수열) - 2017/10/08 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

   static int n;
   
   void process() {
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      
      dfs(1, "1");
   }
   
   void dfs(int len, String str) {
      if(len == n) {
         System.out.println(str);
         System.exit(0);
      }
      
      for(int i=1; i<=3; i++) {
         if(isValid(str+i)) {
            dfs(len+1, str+i);
         }
      }
      
   }
   
   boolean isValid(String str) {
      int start = str.length()-1;
      int end = str.length();
      for(int i=1; i<=str.length()/2; i++) {
         if(str.substring(start-i, end-i).equals(str.substring(end-i, end))) {
            return false;
         }
         start -= 1;
      }
      return true;
   }
   
   public static void main(String[] args) {
      Main main = new Main();
      main.process();
   }

}