package ex11721;

/**
 * 열 개씩 끊어 출력하기 - 2017/09/10 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int cnt=0;
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
			cnt++;
			if(cnt==10) {
				System.out.println();
				cnt=0;
			}
		}
		
	}

}
