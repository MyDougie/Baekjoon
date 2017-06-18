package ex2577;
/**
 * 숫자의 개수 세기 - 2017/04/20 - Complete
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		long result = input.nextInt() * input.nextInt() * input.nextInt() ;
		int arr[] = new int[10];
		
		String strResult = Long.toString(result);
		
		for(int i=0; i<strResult.length(); i++){
			arr[strResult.charAt(i)-48]++;
		}
		
		for(int x : arr)
			System.out.println(x);
	}

}