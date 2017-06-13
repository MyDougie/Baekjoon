package ex1157;

import java.util.Scanner;
/**
 * 문자열처리(글자최대 빈도수) - 2017/04/17 - Complete 
 * */
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		
		int arr [] = new int[26];
		
		for(int i=0; i<str.length(); i++){
			int c = Character.toUpperCase(str.charAt(i));
			arr[c-65]++;
		}
		
		int max = Integer.MIN_VALUE;
		int maxCh = -1;
		for(int i=0; i<arr.length; i++){
			if(max < arr[i]){
				max = arr[i];
				maxCh = i;
			}
		}
		
		for(int i=0; i<arr.length; i++){
			if(arr[i] == max && maxCh != i){
				System.out.println("?");
				return;
			}
		}
		System.out.println(Character.toChars(maxCh+65));
	}
}