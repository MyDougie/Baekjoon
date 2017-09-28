package ex1759;

/**
 * 백트래킹(암호 만들기) - 2017/09/28 - Park Taegyu
 * */
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static String mo = "aeiou";
	
	void process() {
		Scanner sc = new Scanner(System.in);
		String s [] = sc.nextLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		char chArr [] = new char[m];
		s = sc.nextLine().split(" ");
		for(int i=0; i<s.length; i++) {
			chArr[i] = s[i].charAt(0);
		}
		Arrays.sort(chArr);
		
		for(int i=0; i<chArr.length; i++) {
			backTracking(chArr[i]+"", n, i, chArr);
		}
		
	}
	
	void backTracking(String str, int n, int index, char[] chArr) {
		if(str.length() == n) {
			System.out.println(str);
			return;
		}
		
		for(int i=index+1; i<chArr.length; i++) {
			if(isPossible(str+chArr[i], n)) {
				str = str+chArr[i];
				backTracking(str, n, i, chArr);
				str = str.substring(0, str.length()-1);
			}
		}
		
	}
	
	boolean isPossible(String str, int n) {
		int moumCnt=0;
		int jaumCnt=0;
		for(int i=0; i<str.length(); i++) {
			if(mo.contains(str.charAt(i)+"")) {
				moumCnt++;
			}else {
				jaumCnt++;
			}
		}
		if(moumCnt==0 && n-str.length()==0) {
			return false;
		}
		if(2 - jaumCnt > n-str.length()) {
			return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.process();
	}

}
