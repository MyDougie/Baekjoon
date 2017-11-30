package ex1475;

/**
 * 방 번호 - 2017/11/30 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int[] arr = new int[9];
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			ch -= '0';
			
			if(ch == 6 || ch ==9) {
				arr[6]++;
			}else {
				arr[ch]++;
			}
			
		}
		
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			if(i==6) continue;
			max = Math.max(max, arr[i]);	
		}
		System.out.println((int)Math.max(max, Math.ceil(arr[6]/2.0)));
		
	}

}