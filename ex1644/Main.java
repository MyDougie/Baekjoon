package ex1644;

/**
 * 소수의 연속합 - 2017/10/01 - Park Taegyu
 * */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static int n, ans;
	static List<Integer> primeList = new ArrayList<>();
	
	void process() {
		input();
		solve();
	}
	
	void input() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
	}
	
	void solve() {
		getPrimeNumber();
		
		int sum;
		for(int i=0; i<primeList.size(); i++) {
			sum=0;
			for(int j=i; j<primeList.size(); j++) {
				sum += primeList.get(j);
				if(sum == n) {
					ans++;
					break;
				}
				if(sum > n) {
					break;
				}
			}
		}
		
		System.out.println(ans);
		
	}
	
	void getPrimeNumber() {
		boolean isPrime;
		for(int i=2; i<=n; i++) {
			isPrime = true;
			for(int j=2; j<=Math.sqrt(i); j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				primeList.add(i);
			}
		}
	}
	public static void main(String[] args) {
		Main main = new Main();
		main.process();
	}

}
