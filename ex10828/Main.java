package ex10828;

/**
 * 스택구현 - 2017/03/28 - Complete
 * */
import java.util.Scanner;

class Stack{
	int top = -1;
	final int STACK_SIZE = 1000; 
	int s[] = new int[STACK_SIZE]; 
	
	public void push(int x){
		s[++top] = x;
	}
	
	public int pop(){
		if(empty() == 0){//스택에 값이 있으면
			return s[top--];
		}
		return -1;
	}
	
	public int size(){
		return top+1;
	}
	
	public int empty(){
		return (top==-1) ? 1 : 0;
	}
	
	public int  top(){
		if(empty() == 0){//스택에 값이 있으면
			return s[top];
		}
		return -1;
	}
	
	
	
	
	
}
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		Stack s = new Stack();
		int index = 0;
		int result [] = new int[n];
		for(int i=0; i<n; i++){
			String str = input.nextLine();			
			String v [] = str.split(" ");
			if(v.length==2){
				s.push(Integer.parseInt(v[1]));
			}else{
				if(v[0].equals("top")){
					result[index]=s.top();
				}else if(v[0].equals("pop")){
					result[index] = s.pop();
				}else if(v[0].equals("empty")){
					result[index] = s.empty();
				}else if(v[0].equals("size")){
					result[index] = s.size();
				}
				index++;
			}
			
		}
		for(int i=0; i<index; i++)
			System.out.println(result[i]);		
	}

}