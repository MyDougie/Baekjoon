package ex2675;

/**
 * 문자열 반복 - 2017/11/02 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tn = sc.nextInt();
		for(int t=0; t<tn; t++) {
			int n = sc.nextInt();
			String str = sc.next();
			for(int i=0; i<str.length(); i++) {
				for(int j=0; j<n; j++) {
					System.out.print(str.charAt(i));
				}
			}
			System.out.println();
		}
	}

}
