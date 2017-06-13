package ex1065;

import java.util.Scanner;
/**
 * ÇÑ¼ö - 2017/04/20 - Complete
 * */
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a=100;
		int b=10;
		int x,y,tmp;
		
		int count = 99;

			if (n < 100) {
				System.out.println(n);
				return;
			} else {
				for (int i = 100; i <= n; i++) {
					tmp = i;
					x = tmp / 100;
					tmp %= 100;
					y = tmp / 10;
					tmp %= 10;
					if (x - y == y - tmp) {
						count++;
					}
				}
				System.out.println(count);
			}
	}

}