package ex10809;

/**
 * 문자열(알파벳 찾기) - 2017/08/26 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int ans [] = new int [26];
		for(int i=0; i<ans.length; i++) {
			ans[i] = -1;
		}
		
		for(int i=str.length()-1; i>=0; i--) {
			ans[str.charAt(i)-'a'] = i;
		}
		
		for(int i=0; i<ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

}
