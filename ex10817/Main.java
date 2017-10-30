package ex10817;

/**
 * 세 수 - 2017/10/30 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[101];
		int cnt = 0;
		for(int i=0; i<3; i++) {
			arr[sc.nextInt()]++;
		}
		
		for(int i=100; i>=1; i--) {
			cnt += arr[i];
			if(cnt>=2) {
				System.out.println(i);
				break;
			}
		}
		
	}

}
