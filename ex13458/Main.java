package ex13458;

/**
 * 시험감독 - 2017/05/17 - Complete
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		long result = 0;
		int arr[] = new int[n+1];
		
		for(int i=1; i<=n; i++){
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		for(int i=1; i<=n; i++){
			arr[i] -= x;
			if(arr[i] >= 0){
				count = (arr[i] % y == 0) ? (arr[i]/y) : (arr[i]/y + 1) ;
				result += count;
			}
		}
		System.out.println(result + n);
			
	}

}