package ex1100;
/**
 * 문자열(하얀 칸) - 2017/08/26 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	static int temp=0;
	
	static void swap() {
		if(temp==1) {
			temp=0;
		}else {
			temp=1;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int map [][] = new int[8][8];
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				swap();
				map[i][j] = temp;
			}
			swap();
		}
		

		int cnt = 0;
		for(int i=0; i<8; i++) {
			String input = sc.nextLine();
			for(int j=0; j<input.length(); j++) {
				if(input.charAt(j)=='F' && map[i][j]==1) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
