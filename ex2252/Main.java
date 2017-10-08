package ex2252;

/**
 * 위상정렬(줄 세우기) - 2017/10/03 - Park Taegyu
 * */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

   void process() {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      List<Integer> graph[] = new ArrayList[n+1];
      int[] income = new int[n+1];
      
      for(int i=1; i<=n; i++) {
         graph[i] = new ArrayList<>();
      }
      
      int m = sc.nextInt();
      int from, to;
      for(int i=0; i<m; i++) {
         to = sc.nextInt();
         from = sc.nextInt();
         
         graph[to].add(from);
         income[from]++;
      }
      
      int cnt = 0;
      while(true) {
         
         if(cnt == n) break;
         
         for(int i=1; i<income.length; i++) {
            if(income[i] == 0) {
               System.out.print(i+" ");
               cnt++;
               income[i]--;
               
               for(int j=0; j<graph[i].size(); j++) {
                  income[graph[i].get(j)]--;
               }
               
               
            }
         }
         
      }
   }
   
   public static void main(String[] args) {
      Main main = new Main();
      main.process();
   }

}