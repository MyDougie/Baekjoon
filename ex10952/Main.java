package ex10952;

/**
 * 입출력예제(A+B-5) - 2017/09/10 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line;
		while(!(line = sc.nextLine()).equals("0 0")){
			String s [] = line.split(" ");
			System.out.println(Integer.parseInt(s[0]) + Integer.parseInt(s[1]));
		}
	}

}
