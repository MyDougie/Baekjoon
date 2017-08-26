package ex10448;
/**
 * 완전탐색(유레카 이론) - 2017/08/26 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {
	static int arr[];
	
	static int isThreeSum(int m) {
		for(int x=1; x<=45; x++) {
			for(int y=1; y<=45; y++) {
				for(int z=1; z<=45; z++) {
					if(arr[x] + arr[y] + arr[z] == m) {
						return 1;
					}
				}
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new int [46];
		for(int i=1; i<=45; i++) {//1~45
			arr[i] = i*(i+1)/2;
		}
		
		for(int i=1; i<=n; i++) {
			int m = sc.nextInt();
			
			System.out.println(isThreeSum(m));
		}
	}

}
