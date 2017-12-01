package ex10845;

/**
 * 큐 - 2017/12/01 - Park Taegyu
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
	static List<Integer> q = new LinkedList<>();
	static int front, back;
	
	static void push(int num) {
		q.add(num);
	}
	
	static int pop() {
		return q.size()==0 ? -1 : q.remove(0);
	}
	
	static int size() {
		return q.size();
	}
	
	static int empty() {
		return q.size()==0 ? 1 : 0;
	}
	
	static int front() {
		return q.size()==0 ? -1 : q.get(0);
	}
	
	static int back() {
		return q.size()==0 ? -1 : q.get(q.size()-1);
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		while(n-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String order = st.nextToken();
			if(st.hasMoreTokens()) {
				int num = Integer.parseInt(st.nextToken());
				push(num);
			}else {
				switch(order) {
				case"pop": System.out.println(pop()); break;
				case"size": System.out.println(size()); break;
				case"empty": System.out.println(empty()); break;
				case"front": System.out.println(front()); break;
				case"back": System.out.println(back()); break;
				}
			}
			
		}
	}
}
