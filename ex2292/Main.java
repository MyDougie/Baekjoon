package ex2292;

/**
 * 벌집 - 2017/11/27 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum = 1;
		int cnt = 1;
		int six = 6;
		
		while(sum < n) {
			sum += six;
			six += 6;
			cnt++;
		}
		System.out.println(cnt);
	}

}
