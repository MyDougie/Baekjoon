package ex11729;

/**
 * 분할과정복(하노이탑 이동순서) - 2017/07/15 - Complete
 * */
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	static Stack<Integer> fromStack, byStack, toStack;

	static void move(int from, int to) {
		System.out.println(from + " " + to);
	}
	
	
	static void hanoi(int n, int from, int by, int to) {
		if(n==1) {
			move(from, to);
		}else {
			hanoi(n-1, from, to, by);
			move(from, to);
			hanoi(n-1, by, from, to);
		}
		
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println((int)(Math.pow(2, n)-1));
		hanoi(n,1,2,3);
		
	}
	
}
