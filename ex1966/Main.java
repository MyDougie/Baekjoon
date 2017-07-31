package ex1966;

/**
 * 완전탐색(프린터 큐) - 2017/07/31 - Park Taegyu
 * */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	//front의 우선순위보다 더 높은 우선순위가 큐안에 존재하는지 확인하는 함수
	public static boolean check(Queue<Integer> que) {
		boolean result = false;
		int front = que.peek();
		
		for(int i=0; i<que.size(); i++) {
			int x = que.remove();
			if(front < x) {
				result = true;
			}
			que.add(x);
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,result;
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			Queue<Integer> que = new LinkedList<>();
			Queue<Integer> idxQue = new LinkedList<>();
			result = 0;
			
			for(int j=0; j<a; j++) {
				que.add(sc.nextInt());
				idxQue.add(j);
			}

			while(true) {
				if(check(que)) {
					int x = que.remove();
					que.add(x);
					int y = idxQue.remove();
					idxQue.add(y);
				}else {
					result++;
					if(b == idxQue.peek()) {
						System.out.println(result);
						break;
					}
					que.remove();
					idxQue.remove();
				}
				
			}
			que.clear();
			idxQue.clear();
		}
		
	}

}
