package ex1193;

/**
 * 분수찾기 - 2017/11/28 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int top = 1;
		int bot = 1;
		
		int leftDown = 0;
		int right = 1;
		int rightUp = 2;
		int down = 3;
		
		int dir = right;
		int i=1;
		
		while(i != n) {
			
			if(top==1 && dir==right) {
				bot++;
				dir = leftDown;
			}else if(bot==1 && dir==down) {
				top++;
				dir = rightUp;
			}else {
				if(dir==leftDown) {
					top++; bot--;
					if(bot==1) dir = down;
				}else if(dir==rightUp){
					top--; bot++;
					if(top==1) dir = right;
				}
			}
			
			i++;
		}
		
		System.out.println(top + "/" + bot);
		
	}

}
