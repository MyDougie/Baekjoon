package ex2231;

/**
 * 완전탐색(분해합) - 2017/08/26 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int cnt = 0;//자릿수
		int temp = n;
		while(temp>0) {
			temp /= 10;
			cnt++;
		}
		
		int min = Integer.MAX_VALUE;
		for(int i=n-9*cnt; i<=n; i++) {
			//분해합구하고
			String str = i+"";
			int divideSum = i;
			for(int j=0; j<str.length();j++) {
				divideSum += (int)str.charAt(j)-'0';
			}
			
			//더 작으면 배열에 저장	
			if(divideSum==n) {
				min = Math.min(min, i);
			}
		}
		
		System.out.println((min!=Integer.MAX_VALUE) ? min : 0);
		
	}

}
