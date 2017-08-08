package ex1300;

/**
 * Parametric Search(K번째 수) - 2017/08/09 -  Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int left = 1;
		int right = k;
		int result = 0;
		
		while(left <= right) {
			long cnt = 0;
			int mid = (left + right) / 2;
			
			for(int i=1; i<=n; i++) {
				cnt += Math.min(mid/i, n);
			}
			
			if(cnt < k) {
				left = mid + 1;
			}else {
				result = mid;
				right = mid - 1;
			}
			
		}
		
		System.out.println(result);
		
	}

}	
