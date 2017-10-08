package ex11650;

/**
 * 우선순위 큐(좌표 정렬하기) - 2017/10/08 - Park Taegyu
 * */
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

   class Pair implements Comparable<Pair>{
      int x,y;
      
      Pair(int x, int y){
         this.x = x;
         this.y = y;
      }
      
      @Override
      public int compareTo(Pair o) {
         if(this.x < o.x) {
            return -1;
         }else if(this.x > o.x) {
            return 1;
         }else {
            return this.y < o.y ? -1 : 1;
         }
      }
   }
   
   void process() {
      Scanner sc = new Scanner(System.in);
      PriorityQueue<Pair> q = new PriorityQueue<>();
      
      int n = sc.nextInt();
      for(int i=0; i<n; i++) {
         q.offer(new Pair(sc.nextInt(), sc.nextInt()));
      }
      
      while(!q.isEmpty()) {
         Pair p = q.poll();
         System.out.println(p.x + " " + p.y);
      }
   }
   
   public static void main(String[] args) {
      Main main = new Main();
      main.process();
   }

}