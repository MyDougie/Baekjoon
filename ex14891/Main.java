package ex14891;

/**
 * 톱니바퀴 - 2017/10/25 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	static String[] s;
	static boolean[] isFixed;
	
	
	static void process(int idx, int dir) {//dir == 1 시계(right), dir ==-1, 반시계(left)
		isFixed[idx] = true;
		
		if(idx==1) {
			if(s[idx].charAt(2) != s[idx+1].charAt(6) && !isFixed[idx+1]) {
				process(idx+1, dir*-1);
			}
		}else if(idx==2 || idx==3) {
			if(s[idx].charAt(2) != s[idx+1].charAt(6) && !isFixed[idx+1]) {
				process(idx+1, dir*-1);
			}
			if(s[idx].charAt(6) != s[idx-1].charAt(2) && !isFixed[idx-1]) {
				process(idx-1, dir*-1);
			}
		}else if(idx==4) {
			if(s[idx].charAt(6) != s[idx-1].charAt(2) && !isFixed[idx-1]) {
				process(idx-1, dir*-1);
			}
		}

		if(dir==1) {
			rightShift(idx);
		}else {
			leftShift(idx);
		}
		
	}
	
	static void rightShift(int idx) {
		String first = s[idx].substring(0, 7);
		String last = s[idx].substring(7);
		s[idx] = last + first;
	}
	
	static void leftShift(int idx) {
		String first = s[idx].substring(0, 1);
		String last = s[idx].substring(1);
		s[idx] = last + first;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		s = new String[5];
		s[1] = sc.next();
		s[2] = sc.next();
		s[3] = sc.next();
		s[4] = sc.next();
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int idx = sc.nextInt();
			int dir = sc.nextInt();
			
			isFixed = new boolean[5];
			process(idx, dir);
			
		}
		
		int ans=0;
		int x = 1;
		for(int i=1; i<s.length; i++) {
			ans += (s[i].charAt(0)-'0') * x;
			x *= 2;
		}
		System.out.println(ans);
	}

}
