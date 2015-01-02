package com.crazyfundu.github.algorithmsolutions.moderate;


/**
 * Design a method to find the frequency of occurrences of any given word in a book. 
 * @author AvneeshS1
 *
 */
public class FrequencyOfWords {
	static Node root = new Node();
	public static void main(String[] args) {
		FrequencyOfWords f = new FrequencyOfWords();
		String text = "loading The part of a Java virtual machine implementation that takes care of finding and loading types is the class class class are of finding loading";
		f.parse(text);
		String word = "implementation";
		System.out.println(count(word));
	}
	private static int count(String word) {
		int i = 1;
		Node n = root.nexts[word.charAt(0)-'a'];
		while(i < word.length()){
			if(n == null){
				System.out.println("Word isn't there at all");
				return 0;
			}
			n = n.nexts[word.charAt(i)-'a'];
			i++;
		}
		return n.count;
	}
	
	
	private void parse(String text) {
		Node[] nodes = root.nexts;
		String[] arr = text.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String curWord = arr[i].toLowerCase();
			Node n  ;
			if(nodes[curWord.charAt(0)-'a']==null){
				n = new Node();
				n.c = curWord.charAt(0);
				nodes[curWord.charAt(0)-'a']= n;
			}else{
				n = nodes[curWord.charAt(0)-'a'];
			}
			int j;
			for (j = 1; j < arr[i].length(); j++) {
					int index = curWord.charAt(j)-'a';
					if(n.nexts[index]==null){
						Node temp = new Node();
						temp.c = curWord.charAt(j);
						n.nexts[index] = temp;
						n = n.nexts[index];
					}else{
						n = n.nexts[index];
					}
			}
			n.count++;
		}
	}
}

class Node{
	char c;
	int count;
	Node[] nexts = new Node[26];
}
