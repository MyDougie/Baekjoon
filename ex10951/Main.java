package ex10951;

/**
 * 입출력예제(A+B-4) - 2017/09/10 - Park Taegyu
 * */
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			System.out.println(sc.nextInt() + sc.nextInt());
		}
	}
	
}
