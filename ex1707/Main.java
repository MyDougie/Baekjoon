package ex1707;
   
/**
 * 이분 그래프 - 2017/12/10 - Park Taegyu
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

   static ArrayList<ArrayList<Integer>> graph;
   static int RED = -1;
   static int BLUE = 1;
   static boolean isBipartite;

   static void dfs(int node, int c, int[] color, int n) {
      color[node] = c;

      for (int adjNode : graph.get(node)) {
         if (color[adjNode] == c) {
            isBipartite = false;
            return;
         }

         if (color[adjNode] == 0) {
            dfs(adjNode, -c, color, n);
         }
      }

   }

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int tc = Integer.parseInt(br.readLine());

      StringTokenizer st;
      while (tc-- > 0) {
         st = new StringTokenizer(br.readLine());
         int v = Integer.parseInt(st.nextToken());
         int e = Integer.parseInt(st.nextToken());

         graph = new ArrayList<ArrayList<Integer>>();
         int color[] = new int[v + 1];
         isBipartite = true;

         for (int i = 0; i <= v; i++) {
            color[i] = 0;
            graph.add(new ArrayList<Integer>());
         }

         while (e-- > 0) {
            st = new StringTokenizer(br.readLine());

            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());

            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
         }

         // bfs
         Queue<Integer> q = new LinkedList<>();

         for (int i = 1; i <= v; i++) {
            if (color[i] == 0) {
               q.offer(i);
               color[i] = RED;
            }

            while (!q.isEmpty() && isBipartite) {
               int node = q.poll();

               for (int adjNode : graph.get(node)) {
                  if (color[adjNode] == 0) {
                     q.offer(adjNode);
                     color[adjNode] = -color[node];
                  } else if (color[adjNode] != -color[node]) {
                     isBipartite = false;
                     break;
                  }

               }
            }

         }

         // dfs
         /*
          * for(int i=1; i<=v; i++) { if(!isBipartite) { break; } if(color[i] == 0) {
          * dfs(i, RED, color, v); } }
          */
         System.out.println(isBipartite ? "YES" : "NO");
      }

   }

}