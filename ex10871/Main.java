package ex10871;

import java.util.Scanner;
/**
 * impl - 2017/06/13 - Complete
 * */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int compare = sc.nextInt();
		
		for(int i=0; i<n; i++){
			int x = sc.nextInt();
			if(compare > x){
				System.out.print(x+" ");
			}
		}
	}

}
