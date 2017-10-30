package ex4344;

/**
 * 평균은 넘겠지 - 2017/10/30 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tn = sc.nextInt();
		for(int t=0; t<tn; t++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			double sum=0;
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			double avg = sum/n;
			int cnt=0;
			for(int i=0; i<n; i++) {
				if(avg < arr[i]) {
					cnt++;
				}
			}
			
			System.out.printf("%.3f", cnt*100.0/n);
			System.out.print("%\n");
			
		}
	}

}
