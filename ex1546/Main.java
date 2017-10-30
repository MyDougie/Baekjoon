package ex1546;

/**
 * 평균 - 2017/10/30 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		double max = 0;
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			max = Math.max(max, arr[i]);
		}
		
		double sum = 0;
		for(int i=0; i<n; i++) {
			sum += arr[i]/max*100;
		}
		
		System.out.printf("%.2f", sum/n);
		
	}

}
