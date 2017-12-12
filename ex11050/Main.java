package ex11050;

/**
 * 이항 계수1 - 2017/12/12 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	static int nCk(int n, int k) {
		if(k==0 || k==n) {
			return 1;
		}else if(k==1) {
			return n;
		}else {
			return nCk(n-1, k) + nCk(n-1, k-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.println(nCk(n, k));
	}

}
