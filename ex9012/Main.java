package ex9012;

/**
 * WellFormed - 2017/03/30 - Complete
 * */
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Stack<Character> stack = new Stack<>();
		
		
		
		int n = Integer.parseInt(input.nextLine());
		
		String result [] = new String[n];
		for(int i=0; i<result.length; i++)
			result[i] = "YES";
		
		for(int i=0; i<n; i++){
			String str = input.nextLine();
			
			for(int j=0; j<str.length(); j++){
				//System.out.println(str.charAt(j));
				if(str.charAt(j)=='('){
					stack.push(str.charAt(j));
				}else{// )
					if(stack.isEmpty()){//스택이 비어있으면 
						result[i]="NO";
						break;
					}else{//스택에 값이있으면
						stack.pop();
					}
				}
			}
			if(!stack.isEmpty())
				result[i] = "NO";
			stack.clear();
		}
		
		for(String re : result)
			System.out.println(re);
	}
}