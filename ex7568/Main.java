package ex7568;

/**
 * 완전탐색(덩치) - 2017/07/30 - Tae Gyu Park
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[][] = new int[n][3];
		
		for(int i=0; i<n; i++) {
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==j) {
					continue;
				}
				
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					arr[i][2]++;
				}
				
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(arr[i][2]+1);
		}
		
	}

}
