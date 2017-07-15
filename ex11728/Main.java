package ex11728;
/**
 * 배열합치기(정렬) - 2017/07/12 - Complete
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int arrA[] = new int[a];
		int arrB[] = new int[b];
		int arrC[] = new int[a+b];
		
		for(int i=0; i<a; i++) {
			arrA[i] = sc.nextInt();
		}
		for(int i=0; i<b; i++) {
			arrB[i] = sc.nextInt();
		}
		
		int aIndex = 0;
		int bIndex = 0;
	
		while(aIndex+bIndex<arrC.length) {
			if(arrA[aIndex] <= arrB[bIndex]) {
				arrC[aIndex+bIndex] = arrA[aIndex];
				aIndex++;
			}else {
				arrC[aIndex+bIndex] = arrB[bIndex];
				bIndex++;
			}
			
			if(aIndex == arrA.length) {
				for(int i= bIndex; i<arrB.length; i++) {
					arrC[aIndex+bIndex] = arrB[bIndex];
					bIndex++;
				}
				break;
			}
			
			if(bIndex == arrB.length) {
				for(int i= aIndex; i<arrA.length; i++) {
					arrC[aIndex+bIndex] = arrA[aIndex];
					aIndex++;
				}
				break;
			}
			
		}
		
		for(int x : arrC) {
			System.out.print(x+" ");
		}
		
		
	}

}
