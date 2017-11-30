package ex1874;

/**
 * 스택 수열 - 2017/11/30 - Park Taegyu
 * */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] stack  = new int[n];
		int top = 0;
		int max = 0;
		StringBuilder sb = new StringBuilder();
		
		while(n-- > 0) {
			int x = Integer.parseInt(br.readLine());
			
			if(x > max) {
				for(int i=max; i<x; i++) {
					stack[top++] = i+1; 
					sb.append("+\n");
				}
			}else {
				if(stack[top-1] != x) {
					System.out.println("NO");
					return;
				}
			}
			top--;
			sb.append("-\n");
			max = Math.max(max, x);
		}
		
		System.out.println(sb);
		
	}

}
