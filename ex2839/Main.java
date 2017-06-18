package ex2839;
/**
 * ¼³ÅÁ ¹è´Þ - 2017/04/17 - Complete
 * */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int tempNum;
		
		for(int i = num/5; i>=0; i--){
			tempNum = num;
			tempNum -= i*5;
			if(tempNum % 3 == 0){
					System.out.println(i + tempNum/3);
					return;
			}
		}
		System.out.println(-1);
	}
}