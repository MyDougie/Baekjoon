package ex2003;

/**
 * 수들의 합2 - 2017/09/30 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	static int n,m,ans;
	static int arr[];
	
	void input() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}
	
	void process() {
		input();
		
		int sum;
		for(int i=0; i<arr.length; i++) {
			sum=0;
			for(int j=i; j<arr.length; j++) {
				sum += arr[j];
				if(sum>m) {
					break;
				}
				if(sum==m) {
					ans++;
					break;
				}
				
			}
		}
		
		System.out.println(ans);
	}
	
	
	
	public static void main(String[] args) {
		Main main = new Main();
		main.process();
	}

}
