package ex1181;

/**
 * 우선순위 큐(단어 정렬) - 2017/10/15 - Park Taegyu
 * */
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	class Word implements Comparable<Word>{
		String word;
		Word(String word){
			this.word = word;
		}
		
		@Override
		public int compareTo(Word o) {
			int inputLen = this.word.length(); 
			int wordLen = o.word.length();
			if(inputLen < wordLen) {
				return -1;
			}else if(inputLen > wordLen) {
				return 1;
			}else {
				for(int i=0; i<inputLen; i++) {
					if(this.word.charAt(i) == o.word.charAt(i)) continue;
					if(this.word.charAt(i) < o.word.charAt(i)) {
						return -1;
					}else{
						return 1;
					}
				}
			}
			return -1;
		}
		
	}
	
	
	void process() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PriorityQueue<Word> q = new PriorityQueue<>();
		HashSet<String> set = new HashSet<>();
		for(int i=0; i<n; i++) {
			String input = sc.next();
			if(!set.contains(input)) {
				set.add(input);
				q.add(new Word(input));
			}
		}
		
		while(!q.isEmpty()) {
			System.out.println(q.poll().word);
		}
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.process();
	}

}
