package ex5585;
/**
 * 그리디(거스름돈) - 2017/08/14 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 1000-sc.nextInt();
		int coin [] = {500, 100, 50, 10, 5, 1};
		int count = 0;
		
		while(n!=0) {
			for(int i=0; i<coin.length; i++) {
				int div = n / coin[i];
				n -= div * coin[i];
				count += div;
			}
		}
		System.out.println(count);
	}
}
