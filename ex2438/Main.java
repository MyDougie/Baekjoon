package ex2438;

/**
 * 별 찍기-1 - 2017/10/30 - Park Taegyu 
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		String star = "*";
		
		for(int i=1; i<=a; i++) {
			sb.append(star+"\n");
			star += "*";
		}
		System.out.println(sb.toString());
	}

}
