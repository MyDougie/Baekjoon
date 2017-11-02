package ex4673;

/**
 * 셀프 넘버 - 2017/11/02 - Park Taegyu
 * */
public class Main {

	public static void main(String[] args) {
		int[] dn = new int[10000+9+9+9+9];
		for(int i=0; i<10001; i++) {
			int sum=i;
			String s = i+"";
			for(int j=0; j<s.length(); j++) {
				sum += s.charAt(j)-'0';
			}
			dn[sum]++;
		}
		for(int i=0; i<10001; i++) {
			if(dn[i]==0) {
				System.out.println(i);
			}
		}
	}

}
