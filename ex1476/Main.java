package ex1476;

/**
 * 수학(날짜계산) - 2017/09/11 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	static int E,S,M;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		E = sc.nextInt();
		S = sc.nextInt();
		M = sc.nextInt();
	}
	
	void solve() {
		long x = 1;
		
		int a=1;
		int b=1;
		int c=1;
		while(true) {
			if(a==E && b==S && c==M) {
				System.out.println(x);
				break;
			}
			
			a++;
			b++;
			c++;
			x++;
			
			if(a>15) {
				a=1;
			}
			if(b>28) {
				b=1;
			}
			if(c>19) {
				c=1;
			}
		}
		
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.input();
		main.solve();
	}

}
