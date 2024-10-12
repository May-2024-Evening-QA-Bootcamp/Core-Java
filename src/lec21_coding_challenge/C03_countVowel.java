package lec21_coding_challenge;

public class C03_countVowel {

	public static void countVowel (String s) {
		s = s.toLowerCase();
		s = s.replaceAll("\\s", ""); 
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				count++;
			} else if (s.charAt(i) == 'e') {
				count++;
			} else if (s.charAt(i) == 'i') {
				count++;
			} else if (s.charAt(i) == 'o') {
				count++;
			} else if (s.charAt(i) == 'u') {
				count++;
			} 
		}
		System.out.println("Number of Vowel: " + count);
	}

	public static void main(String[] args) {
		countVowel("Pack my box with five dozen liquor jugs");
	}
}
