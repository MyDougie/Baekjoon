package ex1158;

/**
 * 조세퍼스 문제 - 2017/11/30 - Park Taegyu
 * */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=1; i<=n; i++) {
			q.add(i);
		}
		
		System.out.print("<");
		while(!q.isEmpty()) {
			for(int i=0; i<m-1; i++) {
				q.add(q.poll());
			}
			if(q.size()==1) {
				System.out.print(q.poll() + ">");
			}else {
				System.out.print(q.poll() + ", ");
			}
		}
	}

}