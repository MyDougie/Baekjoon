package ex2739;

/**
 * 구구단 - 2017/10/30 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=1; i<=9; i++) {
			System.out.println(a + " * " + i + " = " + a*i);
		}
	}

}
