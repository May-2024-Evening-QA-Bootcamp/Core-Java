package lec21_coding_challenge;

//Que: Write a method to find the number of vowels from the String? Vowel: a, e, i, o, u

public class C05_countConsonant {

	public static void countConsonant(String s) {
		s = s.toLowerCase();
		s = s.replaceAll("\\s", "");
		int count = 0;
		// we got the vowel from below and then deduct from total length, line 20
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				count++;
			}
		}
		// But not a good and smart approach
		// Interviewer don't like the arithmetic expression for coding challenge
		System.out.println("Number of Consonant: " + (s.length() - count));
	} 

	public static void main(String[] args) {
		countConsonant("Pack my box with five dozen liquor jugs");
		countConsonant("A quick brown fox jumps over the lazy dog");
		countConsonant("We love Java Coding");
	}
}
