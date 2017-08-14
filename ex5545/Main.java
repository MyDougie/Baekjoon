package ex5545;

/**
 * 그리디(최고의 피자) - 2017/08/14 - Park Taegyu
 * */
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int toppingNum = sc.nextInt();
		int dowPrice = sc.nextInt();
		int toppingPrice = sc.nextInt();
		int dowCal = sc.nextInt();
		
		int toppingCal [] = new int [toppingNum];
		
		for(int i=0; i<toppingNum; i++) {
			toppingCal[i] = sc.nextInt();
		}
		
		Arrays.sort(toppingCal);

		int max = 0;
		for(int i=0; i<=toppingCal.length; i++) {//토핑의 갯수
			int temp = dowCal;
			for(int j=0; j<i; j++) {
				temp += toppingCal[toppingCal.length-1-j];
			}
			int val = temp / ( dowPrice + toppingPrice * i );
			
			if(max <= val) {
				max = val;
			}else {
				System.out.println(max);
				return;
			}
		}
		
		
	}

}
