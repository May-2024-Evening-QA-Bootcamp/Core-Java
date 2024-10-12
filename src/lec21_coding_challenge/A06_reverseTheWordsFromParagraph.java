package lec21_coding_challenge;

import java.util.Arrays;

/*
Write a function to transform input, e.g.:
Input: "Hello Mohammad Tofael Kabir Sharkar"
Output: "Sharkar Kabir Tofael Mohammad Hello"
*/

public class A06_reverseTheWordsFromParagraph {
	
	public static void reverseTheStringInWords(String s) {
		String [] words = s.split(" ");
		// System.out.println(Arrays.toString(words));
		
		for(int i = words.length-1; i>=0; i-- ) {
			System.out.print(words[i] + " ");
		}
	}

	public static void main(String[] args) {
		reverseTheStringInWords("Hello Mohammad Tofael Kabir Sharkar");
		System.out.println("\n-----------------------");
		reverseTheStringInWords("Mr owl ate my metal worm");

	}

}
