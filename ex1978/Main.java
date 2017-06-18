package ex1978;
/**
 * 소수 갯수 구하기 - 2017/04/21 - Complete
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		boolean flag = true;
		int cnt = 0;
		for(int i=0; i<n; i++){
			int x = input.nextInt();
			flag = true;
			
			if(x==1) flag = false;
			
			for(int j=2; j<=x/2; j++){
				if(x%j==0){
					flag = false;
					break;
				}
			}
			if(flag)
				cnt++;
			
		}
		System.out.println(cnt);
		
	}

}
