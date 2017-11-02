package ex1316;

/**
 * 그룹 단어 체커 - 2017/11/02 - Park Taegyu 
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tn = sc.nextInt();
		int ans=0;
		for(int t=0; t<tn; t++) {
			String str = sc.next();
			str += "!";
			boolean[] visited = new boolean[26];
			for(int i=1; i<str.length(); i++) {
				int before = str.charAt(i-1)-'a';
				int c = str.charAt(i)-'a';
				if(before != c) {
					if(!visited[before]) {
						visited[before] = true;
					}else {
						ans--;
						break;
					}
				}
			}
			ans++;
		}
		System.out.println(ans);
	}

}
