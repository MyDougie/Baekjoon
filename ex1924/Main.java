package ex1924;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * 구현(몇요일인지) - 2017/04/21 - Complete
 * */
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String v [] = str.split(" ");
		int m = Integer.parseInt(v[0]);
		int d = Integer.parseInt(v[1]);
		
		int sumDay = 0;
		
		Map<Integer, String> map = new HashMap<>();
		map.put(0, "MON");
		map.put(1, "TUE");
		map.put(2, "WED");
		map.put(3, "THU");
		map.put(4, "FRI");
		map.put(5, "SAT");
		map.put(6, "SUN");
		
		for(int i=1; i<m; i++){
			if(i==4 || i==6 || i==9 || i==11)
				sumDay += 30;
			else if(i==2)
				sumDay += 28;
			else
				sumDay += 31;
		}
			System.out.println(map.get((sumDay+d-1) % 7));
	}

}
