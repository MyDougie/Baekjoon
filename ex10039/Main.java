package ex10039;

import java.util.Scanner;
/**
 * impl - 2017/06/13 - Complete
 * */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i=0; i<5; i++){
			int x = sc.nextInt();
			if(x<40){
				sum += 40;
			}else{
				sum += x;
			}
		}
		System.out.println(sum/5);
		
	}

}
