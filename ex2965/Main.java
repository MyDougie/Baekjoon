package ex2965;

/**
 * Impl(Ļ�ŷ� ������) - 2017/05/14 - Complete
 * */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(Math.max(b-a, c-b)-1);
	}
}
