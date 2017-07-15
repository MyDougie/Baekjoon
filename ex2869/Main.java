package ex2869;

/**
 *  달팽이는 올라가고 싶다 - 2017/06/02 - Complete
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();

		int start = 0;
		int count = 0;

		while(start < v){
			count ++;
			
			start += a;
			if(start >= v)
				break;
			start -= b;

		}
		System.out.println(count);
	}
}