package ex1753;

/**
 * 다익스트라(최단 경로) - 2017/10/08 - Park Taegyu
 * */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
   
   class Node{
      int vertex;
      int weight;
      Node(int vertex, int weight){
         this.vertex = vertex;
         this.weight = weight;
      }
   }
   
   static final int INF = Integer.MAX_VALUE;
   static ArrayList<Node> graph[];
   static int v;
   static int dist[];
   
   void process() {
      Scanner sc = new Scanner(System.in);
      v = sc.nextInt();
      
      dist = new int[v+1];
      graph = new ArrayList[v+1];
      for(int i=1; i<=v; i++) {
         graph[i] = new ArrayList<>();
      }
      int e = sc.nextInt();
      int start = sc.nextInt();
      
      for(int i=1; i<=v; i++) {
         dist[i] = INF;
      }
      
      for(int i=0; i<e; i++) {
         int src = sc.nextInt();
         int dst = sc.nextInt();
         int weight = sc.nextInt();
         graph[src].add(new Node(dst, weight));
      }
      
      dist[start] = 0;
      dijkstra(start);
      for(int i=1; i<=v; i++) {
         System.out.println(dist[i] == INF ? "INF" : dist[i]);
      }   
      
   }
   
   void dijkstra(int start) {
      Queue<Integer> q = new LinkedList<>();
      q.add(start);
      
      while(!q.isEmpty()) {
         int now = q.poll();
         
         for(int dst=0; dst<graph[now].size(); dst++) {
            Node next = graph[now].get(dst);
            if(dist[next.vertex] > dist[now] + next.weight) {
               dist[next.vertex] = dist[now] + next.weight;
               q.add(next.vertex);
            }
            
         }
      }
   }
   
   public static void main(String[] args) {
      Main main = new Main();
      main.process();
   }

}