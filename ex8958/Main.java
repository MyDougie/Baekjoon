package ex8958;

/**
 * Impl(OX퀴즈) - 2017/04/21 - Complete
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		int grade = 0;
		int sum=0;
		
		int result [] = new int [n];
		
		for(int i=0; i<n; i++){
			sum=0;
			grade=0;
			String str = input.nextLine();
			for(int j=0; j<str.length(); j++){
				if(str.charAt(j)=='O'){
					grade++;
				}else{
					grade=0;
				}
				sum += grade;
			}
			//result[i] = sum;
			System.out.println(sum);
			
			
		}
		/*for(int x : result)
			System.out.println(x);*/
		
		
	}

}