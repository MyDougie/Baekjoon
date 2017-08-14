package ex10798;

/**
 * 구현(세로로 읽기) - 2017/08/14 - Park Taegyu
 * */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Queue<Character>> list = new ArrayList<>();
		
		
		String input [] = new String[5];
		for(int i=0; i<input.length; i++) {
			list.add(new LinkedList<>());
			input[i] = sc.nextLine();
			for(int j=0; j<input[i].length(); j++) {
				list.get(i).add(input[i].charAt(j));
			}
		}
		
		for(int i=0; i<15; i++) {
			for(int j=0; j<5; j++) {
				Character ch = list.get(j).poll();
				if(ch != null) {
					System.out.print(ch);
				}
			}
		}
		
		
	}

}
