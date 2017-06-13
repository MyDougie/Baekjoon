package ex1152;

import java.util.Scanner;
/**
 * 문자열처리(단어갯수 세기) - 2017/04/20 - Complete
 * */
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
	
		if(str.trim().equals("")) {
			System.out.println(0);
			return;
		}
		String result [] = str.split(" ");
		
		int count = 0;
		for(int i=0; i<result.length; i++){
			if(result[i].equals("")){
				count++;
			}
		}
		
		if(result[0].equals("")){
			System.out.println(result.length-count);
		}
		else
			System.out.println(result.length);
		
	}

}
