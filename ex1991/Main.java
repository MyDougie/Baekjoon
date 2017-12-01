package ex1991;

/**
 * 트리 순회 - 2017/12/01 - Park Taegyu
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static class Tree{
		Node root;
		
		public Tree() {
			this.root = null;
		}
		
		void add(char data, char left, char right) {
			
			if(root == null) {
				if(data != '.') root = new Node(data);
				if(left != '.') root.left = new Node(left);
				if(right != '.') root.right = new Node(right);
			}else {
				search(root, data, left, right);
			}
			
		}
		
		void search(Node root, char data, char left, char right) {
			if(root == null) return;
			else if(root.data == data) {
				if(left != '.') root.left = new Node(left);
				if(right != '.') root.right = new Node(right);
			}else {
				search(root.left, data, left, right);
				search(root.right, data, left, right);
			}
		}
		
		void preorder(Node root) {
			System.out.print(root.data);
			if(root.left != null) preorder(root.left);
			if(root.right != null) preorder(root.right);
		}
		
		void inorder(Node root) {
			if(root.left != null) inorder(root.left);
			System.out.print(root.data);
			if(root.right != null) inorder(root.right);
		}
		
		void postorder(Node root) {
			if(root.left != null) postorder(root.left);
			if(root.right != null) postorder(root.right);
			System.out.print(root.data);
		}
	}
	
	static class Node{
		char data;
		Node left;
		Node right;
		
		public Node(char data) {
			this.data = data;
		}
	}
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Tree tree = new Tree();
		
		while(n-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			char parent = st.nextToken().charAt(0);
			char left = st.nextToken().charAt(0);
			char right = st.nextToken().charAt(0);
			
			tree.add(parent, left, right);
		}
		
		tree.preorder(tree.root);
		System.out.println();
		tree.inorder(tree.root);
		System.out.println();
		tree.postorder(tree.root);
		
	}

}
