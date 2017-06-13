package ex10797;

import java.util.Scanner;
/**
 * Impl - 2017/06/13 - Complete
 * */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i=0; i<5; i++){
			if(n == sc.nextInt()){
				sum++;
			}
		}
		System.out.println(sum);
	}

}
