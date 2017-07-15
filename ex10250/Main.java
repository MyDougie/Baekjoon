package ex10250;

/**
 * ACM호텔 - 2017/04/16 - Complete
 * */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		
		int H,N;
		
		int h=0;
		int w=0;
		
		for(int i=0; i<T; i++){
			H = input.nextInt();
			input.nextInt();
			N = input.nextInt();
			
			h = N % H;
			if(h==0)
				h=H;
			if(N%H !=0)
				w = (N / H) + 1;
			else 
				w = N / H;
			
			System.out.print(h);
			if(w<10)
				System.out.print(0);
			System.out.println(w);
			
		}
		
	}
}