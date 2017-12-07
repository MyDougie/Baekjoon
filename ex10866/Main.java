package ex10866;

/**
 * 덱 - 2017/12/07 - Park Taegyu
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static class Deque{
		private Node front;
		private Node back;
		private int size;
		
		static class Node{
			int data;
			Node prev;
			Node next;
		
			public Node(int data) {
				this.data = data;
			}
		}
		
		void push_front(int data) {
			Node node = new Node(data);
			
			if(front == null) {
				front = back = node;
			}else{
				node.next = front;
				front.prev = node;
				front = node;
			}
			size++;
		}
		void push_back(int data) {
			Node node = new Node(data);
			
			if(back == null) {
				front = back = node;
			}else{
				node.prev = back;
				back.next = node;
				back = node;
			}
			size++;
		}
		
		int pop_front() {
			int ret;
			
			if(size()==0) {
				ret = -1;
			}else {
				ret = front.data;
				if(front == back) {//노드가 한개일 때
					front = back = null;
				}else/* if(front.next != null) */{
					front = front.next;
				}
				size--;
			}
			return ret;
		}
		
		int pop_back() {
			int ret;
			
			if(size()==0) {
				ret = -1;
			}else {
				ret = back.data;
				if(front == back) {//노드가 한개일 때
					front = back = null;
				}else /* if(back.prev != null) */{
					back = back.prev;
				}
				size--;
			}
			return ret;
		}
		
		int size() {
			return size;
		}
		int empty() {
			return size()==0 ? 1 : 0;
		}
		int front() {
			return size()==0 ? -1 : front.data;
		}
		int back() {
			return size()==0 ? -1 : back.data;
		}
		
	}
	
	
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		Deque deque = new Deque();
		
		int num = -1;
		while(n-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String order = st.nextToken();
			
			if(st.hasMoreTokens()) {
				num = Integer.parseInt(st.nextToken());
			}
			
			switch (order) {
			case "push_front": deque.push_front(num);break;
			case "push_back": deque.push_back(num);break;
			case "pop_front": System.out.println(deque.pop_front());break;
			case "pop_back": System.out.println(deque.pop_back());break;
			case "size": System.out.println(deque.size());break;
			case "empty": System.out.println(deque.empty());break;
			case "front": System.out.println(deque.front());break;
			case "back": System.out.println(deque.back());break;
			default:break;
			}
		}
		
	}

}
