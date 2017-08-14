package ex5543;

/**
 * 구현(상근날드) - 2017/08/14 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		System.out.println(Math.min(c,Math.min(a, b)) + Math.min(d, e) - 50);
	}

}
