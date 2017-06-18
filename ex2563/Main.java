package ex2563;
/**
 * 색종이 넓이 구하기 - 2017/04/22 - Complete
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int a,b;
		int arr[][] = new int[101][101];
		
		for(int i=0; i<n; i++){
			a = input.nextInt();
			b = input.nextInt();
			for(int j=a; j<a+10; j++){
				for(int k=b; k<b+10; k++){
					arr[j][k]++;		
				}
			}
		}
		
		int sum=0;
		for(int i=1; i<=100; i++){
			for(int j=1; j<=100; j++){
				//System.out.print(arr[i][j]+" ");
				if(arr[i][j] != 0)
					sum++;
			}
			//System.out.println();
		}
		System.out.println(sum);
	}

}