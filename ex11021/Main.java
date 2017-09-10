package ex11021;

/**
 * 입출력예제(A+B-7) - 2017/09/10 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int i=1; i<=n; i++) {
			String s [] = sc.nextLine().split(" ");
			System.out.println("Case #"+i+": " + (Integer.parseInt(s[0]) + Integer.parseInt(s[1])));
		}
	}

}
