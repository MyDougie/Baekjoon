package ex11723;

/**
 * 비트마스크(집합) - 2017/11/08 - Park Taegyu
 * */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static final int SIZE = 20;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int S = 0;
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			String order = st.nextToken();
			int x=0;
			if(st.hasMoreTokens()) {
				x = Integer.parseInt(st.nextToken());
			}
			x--;
			if(order.equals("add")) {
				S |= 1<<x;
			}else if(order.equals("remove")) {
				S &= ~(1<<x);
			}else if(order.equals("check")) {
				bw.write(((S & 1<<x) >> x)+ "\n");
			}else if(order.equals("toggle")) {
				S ^= 1<<x;
			}else if(order.equals("all")) {
				S = (1<<SIZE) - 1;
			}else if(order.equals("empty")) {
				S = 0;
			}
			
		}
		
		bw.flush();
		
		bw.close();
		br.close();
		
	}

}
