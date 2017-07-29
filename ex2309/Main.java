package ex2309;

/**
 * 완전 탐색(일곱 난쟁이) - 2017/07/29 - Complete
 * */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int n = 9;
		int resI = -1;
		int resJ = -1;
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}
		
		Collections.sort(list);
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				
				if(i==j) {
					continue;
				}
				
				int sum = 0;
				for(int k=0; k<n; k++) {
					if(k!=i && k!=j) {
						sum += list.get(k);
					}
				}
				
				if(sum==100) {
					resI = i;
					resJ = j;
					break;
				}else {
					sum = 0;
				}
				
			}
			if(resI>=0) {
				break;
			}
		}
		
		for(int i=0; i<n; i++) {
			if(i!=resI && i!=resJ) {
				System.out.println(list.get(i));
			}
		}
		

	}

}
