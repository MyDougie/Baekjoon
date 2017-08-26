package ex2908;

/**
 * 문자열(상수) - 2017/08/26 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str [] = sc.nextLine().split(" ");
		String a = str[0];
		String b = str[1];
		
		int x = a.charAt(2)-'0';
		int y = b.charAt(2)-'0';
		
		for(int i=1; i>=0; i--) {
			x = x*10 + a.charAt(i)-'0';
			y = y*10 + b.charAt(i)-'0';
		}
		
		System.out.println(Math.max(x, y));
		
	}

}
