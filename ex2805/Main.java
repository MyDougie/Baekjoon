package ex2805;

/**
 * Parametric Search(나무 자르기) - 2017/08/09 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int height [] = new int[n+1];
		int left = 0, right = 0;
		for(int i=1; i<=n; i++) {
			height[i] = sc.nextInt();
			if(height[i] > right) {
				right = height[i];
			}
		}
		
		int result = 0;
		while(left<=right) {
			long sum = 0;
			int mid = (left + right) / 2;
			for(int i=1; i<=n; i++) {
				if(height[i] > mid) {
					sum +=  height[i] - mid;
				}
			}
			
			if(sum < m) {
				right = mid - 1;
			}else {
				if(result < mid) {
					result = mid;
				}
				left = mid + 1;
			}
			
		}
		System.out.println(result);
		
	}

}
