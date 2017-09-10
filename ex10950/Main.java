package ex10950;

/**
 * 입출력예제(A+B-3) - 2017/09/10 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println(sc.nextInt() + sc.nextInt());
		}
	}

}
