package ex2748;
/**
 * 피보나치 수 구하기 - 2017/04/18 - Complete
 * */
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		if(n==0){
			System.out.println(0);
			return;
		}
		if(n==1){
			System.out.println(1);
			return;
		}
		
		long x = 0;
		long y = 1;
		long result = 1;
		for(long i=2; i<=n; i++){
			result = x+y;
			x=y;
			y=result;
		}
		
		System.out.println(result);
	
	}
}