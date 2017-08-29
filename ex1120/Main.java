package ex1120;

/**
 * 완전탐색(문자열) - 2017/08/29 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	private static void solve() {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		int subLen = b.length() - a.length();
		int ans = Integer.MAX_VALUE;
		int cnt = 0;
		
		for(int i=0; i<=subLen; i++) {
			cnt=0;
			for(int j=0; j<a.length(); j++) {
				if(a.charAt(j) != b.charAt(i+j)) {
					cnt++;
				}
			}
			ans = Math.min(cnt, ans);
		}
		System.out.println(ans);
		
	}
	
	public static void main(String[] args) {
		solve();
	}

}
