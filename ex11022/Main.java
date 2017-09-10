package ex11022;

/**
 * 입출력예제(A+B-8) - 2017/09/10 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int i=1; i<=n; i++) {
			String s [] = sc.nextLine().split(" ");
			System.out.println("Case #"+i+": " +s[0] + " + " + s[1] + " = "+ (Integer.parseInt(s[0]) + Integer.parseInt(s[1])));
		}
	}

}
