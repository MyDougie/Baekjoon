package ex2490;

import java.util.Scanner;
/**
 * impl - 2017/06/13 - Complete
 * */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++){
			int sum = 0;
			for(int j=0; j<4; j++){
				sum += (sc.nextInt() == 1) ? 1 : 0;
			}
			switch(sum){
				case 1 : System.out.println("C"); break;
				case 2 : System.out.println("B"); break;
				case 3 : System.out.println("A"); break;
				case 4 : System.out.println("E"); break;
				case 0 : System.out.println("D"); break;
			}
		}
		
	}

}
