package ex7453;


/**
 * 완전탐색(합이 0인 네정수) - 2017/08/08 - Park Taegyu 
 * */
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long result = 0;
		int arr[][] = new int [n][4];
		

		int [] AB = new int[n*n];
		int [] CD = new int[n*n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<4; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int count = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				AB[count] = arr[i][0] + arr[j][1];
				CD[count++] = arr[i][2] + arr[j][3];
			}
		}
		Arrays.sort(AB);
		Arrays.sort(CD);
		
		int start=0;
		int end = n*n-1;
		while(start<n*n && end>=0) {
			if(AB[start] + CD[end] < 0) {
				start++;
			}else if(AB[start] + CD[end] == 0) {
				int tempStart = start;
				int tempEnd = end;
				long count1=0;
				long count2=0;
				
				for(; start<n*n; start++) {
					if((AB[start] == AB[tempStart])) {
						count1++;
					}else {
						break;
					}
				}
				
				for(; end>=0; end--) {
					if((CD[end] == CD[tempEnd])) {
						count2++;
					}else {
						break;
					}
				}
				
				result += count1*count2;
				
			}else {
				end--;
			}
		}
		
		System.out.println(result);
		
	}

}