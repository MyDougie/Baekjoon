package ex10026;

/**
 * DFS(적록색약) - 2017/07/31 - Park Taegyu
 * */
import java.util.Scanner;

public class Main {

	static boolean rangeCheck(int x, int y, int length) {
		return (x>=0 && x<length && y>=0 && y<length) ? true : false;
	}
	
	static void dfs(char [][] arr, boolean [][] visited, int x, int y) {
		visited[x][y] = true;
		char ch = arr[x][y];
		int length = arr.length;
		
		if(rangeCheck(x+1, y, length) && ch == arr[x+1][y] && !visited[x+1][y]) {
			dfs(arr, visited, x+1, y);
		}if(rangeCheck(x, y+1, length) && ch == arr[x][y+1] && !visited[x][y+1]) {
			dfs(arr, visited, x, y+1);
		}if(rangeCheck(x-1, y, length) && ch == arr[x-1][y] && !visited[x-1][y]) {
			dfs(arr, visited, x-1, y);
		}if(rangeCheck(x, y-1, length) && ch == arr[x][y-1] && !visited[x][y-1]) {
			dfs(arr, visited, x, y-1);
		}
			
			
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		char arr[][] = new char[n][n];
		boolean visited[][] = new boolean[n][n];
		int normalResult = 0;
		int blindResult = 0;
		
		for(int i=0; i<n; i++) {
			String str = sc.nextLine();
			for(int j=0; j<str.length(); j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		
		char [][] tempArr = arr;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(!visited[i][j]) {
					dfs(tempArr, visited, i, j);
					normalResult++;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(tempArr[i][j] == 'R') {
					tempArr[i][j] = 'G';
				}
				visited[i][j] = false;
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(!visited[i][j]) {
					dfs(tempArr, visited, i, j);
					blindResult++;
				}
			}
		}
		
		System.out.println(normalResult + " " + blindResult);
		
	}

}
