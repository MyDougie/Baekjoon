package ex10815;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 * Binary Search - 2017/06/02 - Complete
 * */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<a; i++){
			list.add(sc.nextInt());
		}
		
		Collections.sort(list);
		
		int b = sc.nextInt();
		for(int i=0; i<b; i++){
			int left = 0;
			int right = a-1;
			int searchNum = sc.nextInt();
			boolean found = false;
			while(left<=right){
				int mid = left + (right - left) / 2;
				
				if(list.get(mid) < searchNum){
					left = mid+1;
				}else if(list.get(mid) > searchNum){
					right = mid-1;
				}else if(list.get(mid) == searchNum){
					found = true;
					break;
				}
				
				if(left > right){
					found = false;
				}
				
			}
			System.out.print((found ? 1 : 0) + " ");
			
			
		}
		
		
		
	}

}
