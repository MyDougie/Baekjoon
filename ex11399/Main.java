package ex11399;

/**
 * 그리디(ATM) - 2017/08/14 - Park Taegyu
 * */
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr [] = new int [n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int cost = 0;
		int sum = 0;
		for(int i=0; i<n; i++) {
			cost += arr[i];
			sum += cost;
		}
		
		System.out.println(sum);
		
	}

}
