package ex4948;

/**
 * 베르트랑 공준(소수갯수 구하기) - 2017/04/21 - Complete
 * */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean flag;
		int n, cnt;
		
		List<Integer> list = new ArrayList<>();
		
		while((n = Integer.parseInt(input.nextLine())) != 0){
			cnt = 0;
			
			for (int i = n+1; i <= 2*n; i++) {
				flag = true;

				for (int j = 2; j <= Math.sqrt(i); j++) {
					if (i % j == 0) {
						flag = false;
						break;
					}
				}
				if (flag)
					cnt++;

			}
			list.add(cnt);
		}
		
		for(int count : list)
			System.out.println(count);

	}

}