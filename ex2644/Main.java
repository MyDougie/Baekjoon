package ex2644;

/**
 * 촌수계산 - 2017/12/20 - Park Taegyu
 * */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

   static int n;
   static int[][] graph;
   static boolean[] visited;
   static int ans = -1;
   
   static class Node{
      int v;
      int w;
      
      public Node(int v, int w) {
         this.v = v;
         this.w = w;
      }
   }
   
   static void calculate(int start, int end) {
      Queue<Node> q = new LinkedList<>();
      q.add(new Node(start, 0));
      visited[start] = true;
      
      while(!q.isEmpty()) {
         Node node = q.poll();
         visited[node.v] = true;
         
         if(end == node.v) {
            ans = node.w;
            break;
         }
         
         for(int i=1; i<=n; i++) {
            if(graph[node.v][i] == 1 && !visited[i]) {
               q.add(new Node(i, node.w + 1));
            }
         }
      }
      System.out.println(ans);
   }
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      
      graph = new int[n+1][n+1];
      visited = new boolean[n+1];
      
      int start = sc.nextInt();
      int end = sc.nextInt();
      
      int k = sc.nextInt();
      while(k-- > 0) {
         int p = sc.nextInt();
         int s = sc.nextInt();
         
         graph[p][s] = graph[s][p] = 1;
      }
      calculate(start, end);
      
   }

}