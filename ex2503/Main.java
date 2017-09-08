package ex2503;

/**
 * 완전탐색(숫자 야구) - 2017/09/08 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	static int n, ans;
	static int arr[][];
	
	void input() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		arr = new int [n][3];
		for(int i=0; i<n; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
	}
	
	void solve() {
	
		search(123);
		System.out.println(ans);
	}
	
	boolean isDuplicated(int num) {
		String strNum = num+"";
		char a = strNum.charAt(0);
		char b = strNum.charAt(1);
		char c = strNum.charAt(2);
		
		return a==b || b==c || c==a || strNum.contains("0");
	}
	
	int countStrike(int num1, int num2) {
		int cnt = 0;
		String strNum1 = num1+"";
		String strNum2 = num2+"";
		for(int i=0; i<strNum1.length(); i++) {
			if(strNum1.charAt(i) == strNum2.charAt(i)) {
				cnt++;
			}
		}
		
		return cnt;
	}
	
	int countBall(int num1, int num2) {
		int cnt = 0;
		String strNum1 = num1+"";
		String strNum2 = num2+"";
		for(int i=0; i<strNum1.length(); i++) {
			if(strNum1.charAt(i) != strNum2.charAt(i) && strNum2.contains(strNum1.charAt(i)+"")) {
				cnt++;
			}
		}
		
		return cnt;
	}
	
	void search(int num) {
		if(isDuplicated(num)){
			search(num+1);
			return;
		}
		
		if(num>=1000) {
			return;
		}

		for(int i=0; i<arr.length; i++) {
			if(countStrike(num, arr[i][0]) != arr[i][1] || countBall(num, arr[i][0]) != arr[i][2]) {
				search(num+1);
				return;
			}
		}
		
		ans++;
		search(num+1);
		
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.input();
		main.solve();
	}

}
