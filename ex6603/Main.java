package ex6603;

/**
 * 완전탐색(로또) - 2017/08/03 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	static int [] makeBinary(int num, int n) {
		int arr [] = new int [n];
		
		
		while(num>0) {
			arr[--n] = num % 2;
			num /= 2;
		}
		
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 1) {
				count++;
			}
		}
		if(count == 6) {
			return arr;
		}else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str;
		while(!"0".equals(str=sc.nextLine())){
			String v [] = str.split(" ");
			int n = Integer.parseInt(v[0]);
			
			int arr [] = new int[n+1];
			
			int pow = (int) Math.pow(2, n);
	
			for(int i=1; i<v.length; i++) {
				arr[i] = Integer.parseInt(v[i]);
			}
			for(int i=pow-1; i>=0; i--) {
				int binary [] = makeBinary(i, n);
				if(binary != null) {
					for(int j=0; j<binary.length; j++) {
						if(binary[j]==1) {
							System.out.print(arr[j+1]+" ");
						}
					}
					System.out.println();
				}
			}
			
			
			System.out.println();
			
			
		}
	}

}
