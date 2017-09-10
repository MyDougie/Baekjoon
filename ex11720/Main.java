package ex11720;

/**
 * 숫자의 합 - 2017/09/10 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		
		int sum = 0;
		String s [] = sc.nextLine().split("");
		for(String str : s) {
			sum += Integer.parseInt(str);
		}
		System.out.println(sum);
		
	}

}
