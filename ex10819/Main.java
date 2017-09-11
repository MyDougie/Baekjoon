package ex10819;

/**
 * 순열(차이를 최대로) - 2017/09/11 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	static int n;
	static int arr[];
	static int max;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.nextLine());
		arr = new int[n+1];
		for(int i=1; i<=n; i++) {
			arr[i] = sc.nextInt();
		}
		
	}
	
	void solve() {
		factorial(arr, 1);
		System.out.println(max);
	}
	
	void swap(int array[], int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	void factorial(int[] array, int index) {
		if(index == n) {
			return;
		}
		
		for(int i=index; i<=n; i++) {
			swap(array, index, i);
			factorial(array, index+1);
			int sum=0;
			for(int j=1; j<n; j++) {
				sum += Math.abs(array[j] - array[j+1]);
			}
			max = Math.max(max, sum);
			swap(array, index, i);
			
		}
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.input();
		main.solve();
	}

}
