package ex2504;

/**
 * 괄호의 값 - 2017/11/28 - Park Taegyu
 * */
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Stack<String> stack = new Stack<>();
		
		int sum = 0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch==')') {
				if(stack.size()!=0) {
					if(stack.peek().equals("(")) {//괄호면
						stack.pop();
						stack.push("2");
					}else {//숫자면
						 int tmp = 0;
						 while(stack.size()!=0 && !(stack.peek().equals("(") || stack.peek().equals(")") || stack.peek().equals("[") || stack.peek().equals("]"))) {
							 tmp += Integer.parseInt(stack.pop());
						 }
						 if(stack.size() != 0 && (stack.peek().equals(")") || stack.peek().equals("[") || stack.peek().equals("]"))) {
							 sum = 0; break;
						 }
						 if(!stack.isEmpty()) {
							 stack.pop();
							 stack.push(tmp*2+"");
						 }
					}
				}
			}else if(ch==']') {
				if(stack.size()!=0) {
				if(stack.peek().equals("[")) {//괄호면
					stack.pop();
					stack.push("3");
				}else {//숫자면
					 int tmp = 0;
					 while(stack.size()!=0 && !(stack.peek().equals("(") || stack.peek().equals(")") || stack.peek().equals("[") || stack.peek().equals("]"))) {
						 tmp += Integer.parseInt(stack.pop());
					 }
					 if(stack.size()!= 0 && (stack.peek().equals(")") || stack.peek().equals("(") || stack.peek().equals("]"))) {
						 sum = 0; break;
					 }
					 if(!stack.isEmpty()) {
						 stack.pop();
						 stack.push(tmp*3+"");
					 }
				}
				}
			}else {
				stack.push(String.valueOf(ch));
			}
			
		}
		
		
		while(stack.size()!=0 && !(stack.peek().equals("(") || stack.peek().equals(")") || stack.peek().equals("[") || stack.peek().equals("]"))) {
			sum += Integer.parseInt(stack.pop());
		}
		if(stack.size()!=0 ) {
			if(stack.peek().equals(")") || stack.peek().equals("(") || stack.peek().equals("]") || stack.peek().equals("[")) {
				sum = 0;
			}
		 }
		System.out.println(sum);
		
	}

}
