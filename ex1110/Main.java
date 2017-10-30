package ex1110;

/**
 * 더하기 사이클 - 2017/10/30 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int temp = n;
		int cnt=0;
		while(temp!=n || cnt==0) {
			
			int first = temp / 10;
			int last = temp % 10;
			
			temp = last*10 + (first+last)%10;
			cnt++;
		
		}
		System.out.println(cnt);
		
	}

}
