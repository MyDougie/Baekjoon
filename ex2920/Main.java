package ex2920;

/**
 * 음계 - 2017/11/02 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		for(int i=0; i<8; i++) {
			arr[i] = sc.nextInt();
		}
		
		int temp = arr[1] - arr[0];
		String result="";
		for(int i=1; i<7; i++) {
			if(arr[i+1] - arr[i] != temp) {
				result = "mixed";
			}
		}
		if(result=="") {
			if(temp > 0) {
				result = "ascending";
			}else {
				result = "descending";
			}
		}
		System.out.println(result);
	}

}
