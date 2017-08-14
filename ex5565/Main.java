package ex5565;

/**
 * 구현(영수증) - 2017/08/14 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = sc.nextInt();
		
		for(int i=0; i<9; i++) {
			sum -= sc.nextInt();
		}
		
		System.out.println(sum);
	}

}
